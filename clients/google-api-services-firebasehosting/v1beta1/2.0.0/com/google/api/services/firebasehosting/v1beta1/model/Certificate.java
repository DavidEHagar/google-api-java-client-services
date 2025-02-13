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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * An SSL certificate used to provide end-to-end encryption for requests against your domain name. A
 * `Certificate` can be an actual SSL certificate or, for newly-created custom domains, Hosting's
 * intent to create one.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Certificate extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The certificate's creation time. For `TEMPORARY` certs this is the time Hosting
   * first generated challenges for your domain name. For all other cert types, it's the time the
   * actual cert was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The certificate's expiration time. After this time, the cert can no longer be used
   * to provide secure communication between Hosting and your site's visitors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Output only. A set of errors Hosting encountered when attempting to create a cert for your
   * domain name. Resolve these issues to ensure Hosting is able to provide secure communication
   * with your site's visitors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Status> issues;

  /**
   * Output only. The state of the certificate. Only the `CERT_ACTIVE` and `CERT_EXPIRING_SOON`
   * states provide SSL coverage for a domain name. If the state is `PROPAGATING` and Hosting had an
   * active cert for the domain name before, that formerly-active cert provides SSL coverage for the
   * domain name until the current cert propagates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The certificate's type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. A set of ACME challenges you can add to your DNS records or existing, non-Hosting
   * hosting provider to allow Hosting to create an SSL certificate for your domain name before you
   * point traffic toward hosting. You can use thse challenges as part of a zero downtime transition
   * from your old provider to Hosting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CertVerification verification;

  /**
   * Output only. The certificate's creation time. For `TEMPORARY` certs this is the time Hosting
   * first generated challenges for your domain name. For all other cert types, it's the time the
   * actual cert was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The certificate's creation time. For `TEMPORARY` certs this is the time Hosting
   * first generated challenges for your domain name. For all other cert types, it's the time the
   * actual cert was created.
   * @param createTime createTime or {@code null} for none
   */
  public Certificate setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The certificate's expiration time. After this time, the cert can no longer be used
   * to provide secure communication between Hosting and your site's visitors.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. The certificate's expiration time. After this time, the cert can no longer be used
   * to provide secure communication between Hosting and your site's visitors.
   * @param expireTime expireTime or {@code null} for none
   */
  public Certificate setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Output only. A set of errors Hosting encountered when attempting to create a cert for your
   * domain name. Resolve these issues to ensure Hosting is able to provide secure communication
   * with your site's visitors.
   * @return value or {@code null} for none
   */
  public java.util.List<Status> getIssues() {
    return issues;
  }

  /**
   * Output only. A set of errors Hosting encountered when attempting to create a cert for your
   * domain name. Resolve these issues to ensure Hosting is able to provide secure communication
   * with your site's visitors.
   * @param issues issues or {@code null} for none
   */
  public Certificate setIssues(java.util.List<Status> issues) {
    this.issues = issues;
    return this;
  }

  /**
   * Output only. The state of the certificate. Only the `CERT_ACTIVE` and `CERT_EXPIRING_SOON`
   * states provide SSL coverage for a domain name. If the state is `PROPAGATING` and Hosting had an
   * active cert for the domain name before, that formerly-active cert provides SSL coverage for the
   * domain name until the current cert propagates.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the certificate. Only the `CERT_ACTIVE` and `CERT_EXPIRING_SOON`
   * states provide SSL coverage for a domain name. If the state is `PROPAGATING` and Hosting had an
   * active cert for the domain name before, that formerly-active cert provides SSL coverage for the
   * domain name until the current cert propagates.
   * @param state state or {@code null} for none
   */
  public Certificate setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The certificate's type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. The certificate's type.
   * @param type type or {@code null} for none
   */
  public Certificate setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. A set of ACME challenges you can add to your DNS records or existing, non-Hosting
   * hosting provider to allow Hosting to create an SSL certificate for your domain name before you
   * point traffic toward hosting. You can use thse challenges as part of a zero downtime transition
   * from your old provider to Hosting.
   * @return value or {@code null} for none
   */
  public CertVerification getVerification() {
    return verification;
  }

  /**
   * Output only. A set of ACME challenges you can add to your DNS records or existing, non-Hosting
   * hosting provider to allow Hosting to create an SSL certificate for your domain name before you
   * point traffic toward hosting. You can use thse challenges as part of a zero downtime transition
   * from your old provider to Hosting.
   * @param verification verification or {@code null} for none
   */
  public Certificate setVerification(CertVerification verification) {
    this.verification = verification;
    return this;
  }

  @Override
  public Certificate set(String fieldName, Object value) {
    return (Certificate) super.set(fieldName, value);
  }

  @Override
  public Certificate clone() {
    return (Certificate) super.clone();
  }

}
