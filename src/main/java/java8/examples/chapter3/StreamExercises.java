package java8.examples.chapter3;

import java8.examples.chapter1.Album;
import java8.examples.chapter1.SampleData;
import java8.examples.chapter1.Track;

import java.rmi.Naming;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercises {

    public static void main(String[] args) {
        // Lambda表达式就是reducer 执行求和操作：传入stream当前元素和acc，acc就是累加器。
        // 不建议使用
        int count = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);
        System.out.println(count);


        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        int count2 = accumulator.apply(accumulator.apply(accumulator.apply(0, 1), 2), 3);


        // 命令式编程
        int acc = 0;
        for (Integer element : Arrays.asList(1,2,3)){
            acc = acc + element;
        }
        System.out.println(acc);


//        Album album = new Album();

        /*
        1. Album 类有个 getMusicians 方法，该方法返回一个 Stream 对象，包含整张专辑中所有的 表演者；
        2. 使用 filter 方法对表演者进行过滤，只保留乐队；
        3. 使用 map 方法将乐队映射为其所属国家；
        4. 使用 collect(Collectors.toList()) 方法将国籍放入一个列表。
         */
        Set<String> origins = SampleData.manyTrackAlbum.getMusicians()
                .filter(artist -> artist.getName().startsWith("The"))
                .map(artist -> artist.getNationality())
                .collect(Collectors.toSet());


    }


    public Set<String> findLongTracks(List<Album> albums){
        Set<String> trackNames = new HashSet<>();
        for (Album album : albums) {
            for (Track track : album.getTrackList()) {
                if (track.getLength() > 60){
                    String name = track.getName();
                    trackNames.add(name);
                }
            }
        }
        return trackNames;
    }

    public Set<String> findLongTracks2(List<Album> albums){
        Set<String> trackNames = new HashSet<>();
        albums.stream()
                .forEach(album -> {
                    album.getTracks()
                            .forEach(track -> {
                                if (track.getLength() > 60){
                                    String name = track.getName();
                                    trackNames.add(name);
                                }
                            });
                });
        return trackNames;
    }

    public Set<String> findLongTracks3(List<Album> albums){
        Set<String> trackNames = new HashSet<>();
        albums.stream()
                .forEach(album -> {
                    album.getTracks()
                            .filter(track -> track.getLength() > 60)
                            .map(track -> track.getName())
                            .forEach(name -> trackNames.add(name));
                });
        return trackNames;
    }

    public Set<String> findLongTracks4(List<Album> albums){
        Set<String> trackNames = new HashSet<>();

        List<String> list = new ArrayList<>();
        albums.stream()
                .flatMap(album -> album.getTracks())
                .filter(track -> track.getLength() > 60)
                .map(track -> track.getName())
                .forEach(name -> list.add(name));
        return trackNames;
    }




}
