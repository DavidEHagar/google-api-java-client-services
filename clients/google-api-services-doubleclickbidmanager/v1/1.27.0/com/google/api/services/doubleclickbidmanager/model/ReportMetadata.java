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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * Report metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The path to the location in Google Cloud Storage where the report is stored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleCloudStoragePath;

  /**
   * The ending time for the data that is shown in the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long reportDataEndTimeMs;

  /**
   * The starting time for the data that is shown in the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long reportDataStartTimeMs;

  /**
   * Report status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReportStatus status;

  /**
   * The path to the location in Google Cloud Storage where the report is stored.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleCloudStoragePath() {
    return googleCloudStoragePath;
  }

  /**
   * The path to the location in Google Cloud Storage where the report is stored.
   * @param googleCloudStoragePath googleCloudStoragePath or {@code null} for none
   */
  public ReportMetadata setGoogleCloudStoragePath(java.lang.String googleCloudStoragePath) {
    this.googleCloudStoragePath = googleCloudStoragePath;
    return this;
  }

  /**
   * The ending time for the data that is shown in the report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReportDataEndTimeMs() {
    return reportDataEndTimeMs;
  }

  /**
   * The ending time for the data that is shown in the report.
   * @param reportDataEndTimeMs reportDataEndTimeMs or {@code null} for none
   */
  public ReportMetadata setReportDataEndTimeMs(java.lang.Long reportDataEndTimeMs) {
    this.reportDataEndTimeMs = reportDataEndTimeMs;
    return this;
  }

  /**
   * The starting time for the data that is shown in the report.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReportDataStartTimeMs() {
    return reportDataStartTimeMs;
  }

  /**
   * The starting time for the data that is shown in the report.
   * @param reportDataStartTimeMs reportDataStartTimeMs or {@code null} for none
   */
  public ReportMetadata setReportDataStartTimeMs(java.lang.Long reportDataStartTimeMs) {
    this.reportDataStartTimeMs = reportDataStartTimeMs;
    return this;
  }

  /**
   * Report status.
   * @return value or {@code null} for none
   */
  public ReportStatus getStatus() {
    return status;
  }

  /**
   * Report status.
   * @param status status or {@code null} for none
   */
  public ReportMetadata setStatus(ReportStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public ReportMetadata set(String fieldName, Object value) {
    return (ReportMetadata) super.set(fieldName, value);
  }

  @Override
  public ReportMetadata clone() {
    return (ReportMetadata) super.clone();
  }

}
