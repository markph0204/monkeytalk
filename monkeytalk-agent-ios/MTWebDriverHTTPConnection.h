//
//  MTWebDriverHTTPConnection.h
//  iWebDriver
//
//  Copyright 2009 Google Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.

#import <Foundation/Foundation.h>
#import "MTHTTPConnection.h"

// |MTWebDriverHTTPConnection| overrides some of the MTHTTPConnection methods to
// change the default behaviour.
// We allow all HTTP methods. We forward requests to the |MTRESTServiceMapping|
// instead of looking for files on the file system and we implement a custom
// 404 response.
@interface MTWebDriverHTTPConnection : MTHTTPConnection {

}

@end
