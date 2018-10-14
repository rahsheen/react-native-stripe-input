// @flow

import { requireNativeComponent } from 'react-native';

// requireNativeComponent automatically resolves 'StripeInput' to 'StripeInputManager'
module.exports = requireNativeComponent('RNSTPInput', null);
