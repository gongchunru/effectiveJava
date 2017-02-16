package chapter2.No01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by gongchunru on 2017/2/16.
 */
public class Services {

    private Services() {
    }

    private Services(String a, Integer b) {

    }


    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider provider) {
        registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }

    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("no provider registered with name");
        }
        return p.newService();
    }

}
