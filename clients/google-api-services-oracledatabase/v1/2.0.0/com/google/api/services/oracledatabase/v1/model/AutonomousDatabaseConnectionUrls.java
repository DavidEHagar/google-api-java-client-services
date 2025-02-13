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

package com.google.api.services.oracledatabase.v1.model;

/**
 * The URLs for accessing Oracle Application Express (APEX) and SQL Developer Web with a browser
 * from a Compute instance. https://docs.oracle.com/en-
 * us/iaas/api/#/en/database/20160918/datatypes/AutonomousDatabaseConnectionUrls
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Oracle Database@Google Cloud API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutonomousDatabaseConnectionUrls extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Oracle Application Express (APEX) URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apexUri;

  /**
   * Output only. The URL of the Database Transforms for the Autonomous Database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseTransformsUri;

  /**
   * Output only. The URL of the Graph Studio for the Autonomous Database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String graphStudioUri;

  /**
   * Output only. The URL of the Oracle Machine Learning (OML) Notebook for the Autonomous Database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineLearningNotebookUri;

  /**
   * Output only. The URL of Machine Learning user management the Autonomous Database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineLearningUserManagementUri;

  /**
   * Output only. The URL of the MongoDB API for the Autonomous Database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mongoDbUri;

  /**
   * Output only. The Oracle REST Data Services (ORDS) URL of the Web Access for the Autonomous
   * Database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ordsUri;

  /**
   * Output only. The URL of the Oracle SQL Developer Web for the Autonomous Database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sqlDevWebUri;

  /**
   * Output only. Oracle Application Express (APEX) URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getApexUri() {
    return apexUri;
  }

  /**
   * Output only. Oracle Application Express (APEX) URL.
   * @param apexUri apexUri or {@code null} for none
   */
  public AutonomousDatabaseConnectionUrls setApexUri(java.lang.String apexUri) {
    this.apexUri = apexUri;
    return this;
  }

  /**
   * Output only. The URL of the Database Transforms for the Autonomous Database.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseTransformsUri() {
    return databaseTransformsUri;
  }

  /**
   * Output only. The URL of the Database Transforms for the Autonomous Database.
   * @param databaseTransformsUri databaseTransformsUri or {@code null} for none
   */
  public AutonomousDatabaseConnectionUrls setDatabaseTransformsUri(java.lang.String databaseTransformsUri) {
    this.databaseTransformsUri = databaseTransformsUri;
    return this;
  }

  /**
   * Output only. The URL of the Graph Studio for the Autonomous Database.
   * @return value or {@code null} for none
   */
  public java.lang.String getGraphStudioUri() {
    return graphStudioUri;
  }

  /**
   * Output only. The URL of the Graph Studio for the Autonomous Database.
   * @param graphStudioUri graphStudioUri or {@code null} for none
   */
  public AutonomousDatabaseConnectionUrls setGraphStudioUri(java.lang.String graphStudioUri) {
    this.graphStudioUri = graphStudioUri;
    return this;
  }

  /**
   * Output only. The URL of the Oracle Machine Learning (OML) Notebook for the Autonomous Database.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineLearningNotebookUri() {
    return machineLearningNotebookUri;
  }

  /**
   * Output only. The URL of the Oracle Machine Learning (OML) Notebook for the Autonomous Database.
   * @param machineLearningNotebookUri machineLearningNotebookUri or {@code null} for none
   */
  public AutonomousDatabaseConnectionUrls setMachineLearningNotebookUri(java.lang.String machineLearningNotebookUri) {
    this.machineLearningNotebookUri = machineLearningNotebookUri;
    return this;
  }

  /**
   * Output only. The URL of Machine Learning user management the Autonomous Database.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineLearningUserManagementUri() {
    return machineLearningUserManagementUri;
  }

  /**
   * Output only. The URL of Machine Learning user management the Autonomous Database.
   * @param machineLearningUserManagementUri machineLearningUserManagementUri or {@code null} for none
   */
  public AutonomousDatabaseConnectionUrls setMachineLearningUserManagementUri(java.lang.String machineLearningUserManagementUri) {
    this.machineLearningUserManagementUri = machineLearningUserManagementUri;
    return this;
  }

  /**
   * Output only. The URL of the MongoDB API for the Autonomous Database.
   * @return value or {@code null} for none
   */
  public java.lang.String getMongoDbUri() {
    return mongoDbUri;
  }

  /**
   * Output only. The URL of the MongoDB API for the Autonomous Database.
   * @param mongoDbUri mongoDbUri or {@code null} for none
   */
  public AutonomousDatabaseConnectionUrls setMongoDbUri(java.lang.String mongoDbUri) {
    this.mongoDbUri = mongoDbUri;
    return this;
  }

  /**
   * Output only. The Oracle REST Data Services (ORDS) URL of the Web Access for the Autonomous
   * Database.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrdsUri() {
    return ordsUri;
  }

  /**
   * Output only. The Oracle REST Data Services (ORDS) URL of the Web Access for the Autonomous
   * Database.
   * @param ordsUri ordsUri or {@code null} for none
   */
  public AutonomousDatabaseConnectionUrls setOrdsUri(java.lang.String ordsUri) {
    this.ordsUri = ordsUri;
    return this;
  }

  /**
   * Output only. The URL of the Oracle SQL Developer Web for the Autonomous Database.
   * @return value or {@code null} for none
   */
  public java.lang.String getSqlDevWebUri() {
    return sqlDevWebUri;
  }

  /**
   * Output only. The URL of the Oracle SQL Developer Web for the Autonomous Database.
   * @param sqlDevWebUri sqlDevWebUri or {@code null} for none
   */
  public AutonomousDatabaseConnectionUrls setSqlDevWebUri(java.lang.String sqlDevWebUri) {
    this.sqlDevWebUri = sqlDevWebUri;
    return this;
  }

  @Override
  public AutonomousDatabaseConnectionUrls set(String fieldName, Object value) {
    return (AutonomousDatabaseConnectionUrls) super.set(fieldName, value);
  }

  @Override
  public AutonomousDatabaseConnectionUrls clone() {
    return (AutonomousDatabaseConnectionUrls) super.clone();
  }

}
