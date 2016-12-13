package com.inkitt.shimmer;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

//import android.view.View;


public class RNShimmerManager extends SimpleViewManager<RNShimmeringView> {

    public static final String REACT_CLASS = "RCTShimmeringView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RNShimmeringView createViewInstance(ThemedReactContext context) {
        return new RNShimmeringView(context);
    }

}
