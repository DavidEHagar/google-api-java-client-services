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

package com.google.api.services.firebaseappdistribution.v1alpha.model;

/**
 * An app.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Distribution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppdistroV1alphaApp extends com.google.api.client.json.GenericJson {

  /**
   * App bundle test certificate generated for the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirebaseAppdistroV1alphaAabCertificate aabCertificate;

  /**
   * App bundle state. Only valid for android apps. The app_view field in the request must be set to
   * FULL in order for this to be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aabState;

  /**
   * Firebase gmp app id
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * Bundle identifier
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bundleId;

  /**
   * Developer contact email for testers to reach out to about privacy or support issues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contactEmail;

  /**
   * iOS or Android
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platform;

  /**
   * Project number of the Firebase project, for example 300830567303.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectNumber;

  /**
   * App bundle test certificate generated for the app.
   * @return value or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaAabCertificate getAabCertificate() {
    return aabCertificate;
  }

  /**
   * App bundle test certificate generated for the app.
   * @param aabCertificate aabCertificate or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaApp setAabCertificate(GoogleFirebaseAppdistroV1alphaAabCertificate aabCertificate) {
    this.aabCertificate = aabCertificate;
    return this;
  }

  /**
   * App bundle state. Only valid for android apps. The app_view field in the request must be set to
   * FULL in order for this to be populated.
   * @return value or {@code null} for none
   */
  public java.lang.String getAabState() {
    return aabState;
  }

  /**
   * App bundle state. Only valid for android apps. The app_view field in the request must be set to
   * FULL in order for this to be populated.
   * @param aabState aabState or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaApp setAabState(java.lang.String aabState) {
    this.aabState = aabState;
    return this;
  }

  /**
   * Firebase gmp app id
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * Firebase gmp app id
   * @param appId appId or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaApp setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Bundle identifier
   * @return value or {@code null} for none
   */
  public java.lang.String getBundleId() {
    return bundleId;
  }

  /**
   * Bundle identifier
   * @param bundleId bundleId or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaApp setBundleId(java.lang.String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Developer contact email for testers to reach out to about privacy or support issues.
   * @return value or {@code null} for none
   */
  public java.lang.String getContactEmail() {
    return contactEmail;
  }

  /**
   * Developer contact email for testers to reach out to about privacy or support issues.
   * @param contactEmail contactEmail or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaApp setContactEmail(java.lang.String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * iOS or Android
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatform() {
    return platform;
  }

  /**
   * iOS or Android
   * @param platform platform or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaApp setPlatform(java.lang.String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Project number of the Firebase project, for example 300830567303.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectNumber() {
    return projectNumber;
  }

  /**
   * Project number of the Firebase project, for example 300830567303.
   * @param projectNumber projectNumber or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaApp setProjectNumber(java.lang.String projectNumber) {
    this.projectNumber = projectNumber;
    return this;
  }

  @Override
  public GoogleFirebaseAppdistroV1alphaApp set(String fieldName, Object value) {
    return (GoogleFirebaseAppdistroV1alphaApp) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppdistroV1alphaApp clone() {
    return (GoogleFirebaseAppdistroV1alphaApp) super.clone();
  }

}
