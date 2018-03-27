package fuyu.fcmdemo;

import android.content.Context;

public class SPHelper {

    public static void saveToken(Context context, String token) {
        context.getSharedPreferences("config", Context.MODE_PRIVATE).edit().putString("token", token).apply();
    }

    public static String getToken(Context context) {
        return context.getSharedPreferences("config", Context.MODE_PRIVATE).getString("token", "");
    }
}
