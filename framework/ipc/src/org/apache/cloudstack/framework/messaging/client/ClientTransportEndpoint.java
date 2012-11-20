/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cloudstack.framework.messaging.client;

import org.apache.cloudstack.framework.messaging.TransportEndpoint;
import org.apache.cloudstack.framework.messaging.TransportMultiplexier;

public class ClientTransportEndpoint implements TransportEndpoint {

	@Override
	public String getEndpointAddress() {
		// ???
		return "";
	}
	
	@Override
	public void onAttachConfirm(boolean bSuccess, String endpointAddress) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void onDetachIndication(String endpointAddress) {
	}

	@Override
	public void registerMultiplexier(String name,
			TransportMultiplexier multiplexier) {
		// TODO Auto-generated method stub
	}

	@Override
	public void unregisterMultiplexier(String name) {
		// TODO Auto-generated method stub
	}

	@Override
	public void sendMessage(String sourceEndpointAddress,
			String targetEndpointAddress, String multiplexier, String message) {
		// TODO Auto-generated method stub
	}
}
