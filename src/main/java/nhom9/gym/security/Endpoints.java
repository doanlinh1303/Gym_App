package nhom9.gym.security;

public class Endpoints {
    public static final String front_end_host = "http://localhost:3000";
    public static final String[] PUBLIC_GET_ENDPOINS = {
            "/account/login",
            "/account/signup",
            "/user",
            "/user/**",
            "/role",
            "/role/**",
            "/account/active",
            "/pack",

            "/pack/**",

            "/notification",
            "/notification/**",
            "/trainer",
            "/trainer/**",
            "/room",
            "/room/**",
            "/equipment",
            "/equipment/**",
            "/pack-registration",
            "/pack-registration/**",
            "/trainer-registration",
            "/trainer-registration/**"
    };


    public static final String[] PUBLIC_POST_ENDPOINS = {
            "/account/login",
            "/account/signup",
            "/pack",
            "/pack/**",
            "/notification",
            "/notification/**",
            "/trainer",
            "/trainer/**",
            "/room",
            "/room/**",
            "/equipment",
            "/equipment/**",
            "/pack-registration",
            "/pack-registration/**",
            "/trainer-registration",
            "/trainer-registration/**"
    };

    public static final String[] PUBLIC_PUT_ENDPOINS = {
//
            "/user/**",
            "/user",
    };
    public static final String[] PUBLIC_DELETE_ENDPOINS = {
//

    };
    public static final String[] ADMIN_GET_ENDPOINS = {
            "/user",
            "/role",
            "/role/**",
            "/user/**",
            "/pack",
            "/task",
            "/pack/**",
            "/task/**",

    };
    public static final String[] ADMIN_POST_ENDPOINS = {
            "/user",
            "/role",
            "/role/**",
            "/user/**",
            "/pack",
            "/task",
            "/pack/**",
            "/task/**",

    };
}