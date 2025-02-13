/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.accesscontextmanager.v1.model;

/**
 * Access settings represent the set of conditions that must be met for access to be granted. At
 * least one of the fields must be set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessSettings extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Access level that a user must have to be granted access. Only one access level is
   * supported, not multiple. This repeated field must have exactly one element. Example:
   * "accessPolicies/9522/accessLevels/device_trusted"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> accessLevels;

  /**
   * Optional. Session settings applied to user access on a given AccessScope.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SessionSettings sessionSettings;

  /**
   * Optional. Access level that a user must have to be granted access. Only one access level is
   * supported, not multiple. This repeated field must have exactly one element. Example:
   * "accessPolicies/9522/accessLevels/device_trusted"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAccessLevels() {
    return accessLevels;
  }

  /**
   * Optional. Access level that a user must have to be granted access. Only one access level is
   * supported, not multiple. This repeated field must have exactly one element. Example:
   * "accessPolicies/9522/accessLevels/device_trusted"
   * @param accessLevels accessLevels or {@code null} for none
   */
  public AccessSettings setAccessLevels(java.util.List<java.lang.String> accessLevels) {
    this.accessLevels = accessLevels;
    return this;
  }

  /**
   * Optional. Session settings applied to user access on a given AccessScope.
   * @return value or {@code null} for none
   */
  public SessionSettings getSessionSettings() {
    return sessionSettings;
  }

  /**
   * Optional. Session settings applied to user access on a given AccessScope.
   * @param sessionSettings sessionSettings or {@code null} for none
   */
  public AccessSettings setSessionSettings(SessionSettings sessionSettings) {
    this.sessionSettings = sessionSettings;
    return this;
  }

  @Override
  public AccessSettings set(String fieldName, Object value) {
    return (AccessSettings) super.set(fieldName, value);
  }

  @Override
  public AccessSettings clone() {
    return (AccessSettings) super.clone();
  }

}
