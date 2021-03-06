/*
*Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/
package org.wso2.carbon.cassandra.cluster.proxy.data;

public class ProxyNodeInitialInfo {
    private boolean isGossipEnable;
    private boolean isRPCEnable;
    private boolean isIncrementalBackupEnable;
    private String[] snapshotNames;
    private boolean isJoin;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isJoin() {
        return isJoin;
    }

    public void setJoin(boolean join) {
        isJoin = join;
    }

    public boolean isGossipEnable() {
        return isGossipEnable;
    }

    public void setGossipEnable(boolean gossipEnable) {
        isGossipEnable = gossipEnable;
    }

    public boolean isRPCEnable() {
        return isRPCEnable;
    }

    public void setRPCEnable(boolean RPCEnable) {
        isRPCEnable = RPCEnable;
    }

    public boolean isIncrementalBackupEnable() {
        return isIncrementalBackupEnable;
    }

    public void setIncrementalBackupEnable(boolean incrementalBackupEnable) {
        isIncrementalBackupEnable = incrementalBackupEnable;
    }

    public String[] getSnapshotNames() {
        return snapshotNames;
    }

    public void setSnapshotNames(String[] snapshotNames) {
        this.snapshotNames = snapshotNames;
    }


}
