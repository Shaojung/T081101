package tw.com.pcschool.t081101;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Student on 2016/8/11.
 */
public class MyReceiveToken extends FirebaseInstanceIdService {
        @Override
        public void onTokenRefresh() {
            String token = FirebaseInstanceId.getInstance().getToken();
            Log.d("FCM", "Token:"+token);
        }
}
