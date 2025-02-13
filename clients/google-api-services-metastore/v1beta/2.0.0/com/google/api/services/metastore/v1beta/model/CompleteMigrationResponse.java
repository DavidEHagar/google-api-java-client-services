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

package com.google.api.services.metastore.v1beta.model;

/**
 * Response message for DataprocMetastore.CompleteMigration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompleteMigrationResponse extends com.google.api.client.json.GenericJson {

  /**
   * The relative resource name of the migration execution, in the following form:projects/{project_
   * number}/locations/{location_id}/services/{service_id}/migrationExecutions/{migration_execution_
   * id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String migrationExecution;

  /**
   * The relative resource name of the migration execution, in the following form:projects/{project_
   * number}/locations/{location_id}/services/{service_id}/migrationExecutions/{migration_execution_
   * id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getMigrationExecution() {
    return migrationExecution;
  }

  /**
   * The relative resource name of the migration execution, in the following form:projects/{project_
   * number}/locations/{location_id}/services/{service_id}/migrationExecutions/{migration_execution_
   * id}.
   * @param migrationExecution migrationExecution or {@code null} for none
   */
  public CompleteMigrationResponse setMigrationExecution(java.lang.String migrationExecution) {
    this.migrationExecution = migrationExecution;
    return this;
  }

  @Override
  public CompleteMigrationResponse set(String fieldName, Object value) {
    return (CompleteMigrationResponse) super.set(fieldName, value);
  }

  @Override
  public CompleteMigrationResponse clone() {
    return (CompleteMigrationResponse) super.clone();
  }

}
