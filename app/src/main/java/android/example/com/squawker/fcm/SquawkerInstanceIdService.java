package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class SquawkerInstanceIdService extends FirebaseInstanceIdService {

    private static String TAG = SquawkerInstanceIdService.class.getName();

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "New token: " + token);
    }
}
