package com.stripeinput;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.stripe.android.view.CardInputWidget;


public class ReactNativeStripeViewManager extends SimpleViewManager<CardInputWidget> {

    public static final String REACT_CLASS = "RNSTPInput";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public CardInputWidget createViewInstance(ThemedReactContext context) {
        return new CardInputWidget(context);
    }
}
