//
//  RNSTPinputManager.m
//  testproject
//
//  Created by Rahsheen Porter on 10/14/18.
//  Copyright © 2018 Facebook. All rights reserved.
//

#import "RNSTPInputManager.h"

@implementation RNSTPInputManager

RCT_EXPORT_MODULE()

- (UIView *)view
{
  return [[STPPaymentCardTextField alloc] init];
}

@end
