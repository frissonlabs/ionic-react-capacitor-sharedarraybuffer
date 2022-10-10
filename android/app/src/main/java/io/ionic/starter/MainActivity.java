package io.ionic.starter;

import android.os.Build;
import android.os.Bundle;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// if (android.os.Build.VERSION.SDK_INT > 22) {
		// super.requestPermissions(permissions, REQUEST_RECORD_AUDIO_PERMISSION);
		// }
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			ServiceWorkerController swController = ServiceWorkerController.getInstance();

			swController.setServiceWorkerClient(new ServiceWorkerClient() {
				@Override
				public WebResourceResponse shouldInterceptRequest(WebResourceRequest request) {
					return bridge.getLocalServer().shouldInterceptRequest(request);
				}
			});
		}
	}
}
