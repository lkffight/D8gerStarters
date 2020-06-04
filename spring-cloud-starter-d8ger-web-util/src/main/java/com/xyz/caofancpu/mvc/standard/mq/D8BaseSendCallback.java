/*
 * Copyright 2016-2020 the original author
 *
 * @D8GER(https://github.com/caofanCPU).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xyz.caofancpu.mvc.standard.mq;

/**
 * MQ回调处理
 *
 * @author D8GER
 */
public interface D8BaseSendCallback {
    /**
     * 发送成功，业务回调处理后续逻辑
     *
     * @param d8BaseMessage
     */
    void onSuccess(D8BaseMessage d8BaseMessage)
            throws Exception;

    /**
     * 发送失败，业务回调处理后续逻辑
     *
     * @param d8BaseMessage
     */
    void onFailed(D8BaseMessage d8BaseMessage)
            throws Exception;
}
