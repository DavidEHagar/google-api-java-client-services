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

package com.google.api.services.merchantapi.conversions_v1beta.model;

/**
 * "Google Analytics Link" sources can be used to get conversion data from an existing Google
 * Analytics property into the linked Merchant Center account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsLink extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Attribution settings for the linked Google Analytics property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AttributionSettings attributionSettings;

  /**
   * Output only. Name of the Google Analytics property the merchant is linked to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String property;

  /**
   * Required. Immutable. ID of the Google Analytics property the merchant is linked to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long propertyId;

  /**
   * Output only. Attribution settings for the linked Google Analytics property.
   * @return value or {@code null} for none
   */
  public AttributionSettings getAttributionSettings() {
    return attributionSettings;
  }

  /**
   * Output only. Attribution settings for the linked Google Analytics property.
   * @param attributionSettings attributionSettings or {@code null} for none
   */
  public GoogleAnalyticsLink setAttributionSettings(AttributionSettings attributionSettings) {
    this.attributionSettings = attributionSettings;
    return this;
  }

  /**
   * Output only. Name of the Google Analytics property the merchant is linked to.
   * @return value or {@code null} for none
   */
  public java.lang.String getProperty() {
    return property;
  }

  /**
   * Output only. Name of the Google Analytics property the merchant is linked to.
   * @param property property or {@code null} for none
   */
  public GoogleAnalyticsLink setProperty(java.lang.String property) {
    this.property = property;
    return this;
  }

  /**
   * Required. Immutable. ID of the Google Analytics property the merchant is linked to.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPropertyId() {
    return propertyId;
  }

  /**
   * Required. Immutable. ID of the Google Analytics property the merchant is linked to.
   * @param propertyId propertyId or {@code null} for none
   */
  public GoogleAnalyticsLink setPropertyId(java.lang.Long propertyId) {
    this.propertyId = propertyId;
    return this;
  }

  @Override
  public GoogleAnalyticsLink set(String fieldName, Object value) {
    return (GoogleAnalyticsLink) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsLink clone() {
    return (GoogleAnalyticsLink) super.clone();
  }

}
