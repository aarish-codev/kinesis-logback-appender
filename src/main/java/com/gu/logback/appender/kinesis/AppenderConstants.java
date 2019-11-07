/*******************************************************************************
 * Copyright 2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 ******************************************************************************/
package com.gu.logback.appender.kinesis;

import software.amazon.awssdk.regions.Region;

/**
 * Contains constants and default configuration values for the appender
 */
public class AppenderConstants {
  public static final String USER_AGENT_STRING = "kinesis-logback-appender/2.0.0";
  // Default values
  public static final String DEFAULT_ENCODING = "UTF-8";
  public static final int DEFAULT_MAX_RETRY_COUNT = 3;
  public static final int DEFAULT_BUFFER_SIZE = 2000;
  public static final int DEFAULT_THREAD_COUNT = 20;
  public static final int DEFAULT_SHUTDOWN_TIMEOUT_SEC = 30;
  public static final int DEFAULT_THREAD_KEEP_ALIVE_SEC = 30;
  public static final String DEFAULT_REGION = Region.US_EAST_1.id();
  public static final String DEFAULT_SERVICE_NAME = "kinesis";
}
