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

package com.google.api.services.dataflow.model;

/**
 * Worker metrics exported from workers. This contains resource utilization metrics accumulated from
 * a variety of sources. For more information, see go/df-resource-signals.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceUtilizationReport extends com.google.api.client.json.GenericJson {

  /**
   * Per container information. Key: container name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ResourceUtilizationReport> containers;

  /**
   * CPU utilization samples.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CPUTime> cpuTime;

  static {
    // hack to force ProGuard to consider CPUTime used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CPUTime.class);
  }

  /**
   * Optional. GPU usage samples.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GPUUsage> gpuUsage;

  static {
    // hack to force ProGuard to consider GPUUsage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GPUUsage.class);
  }

  /**
   * Memory utilization samples.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MemInfo> memoryInfo;

  static {
    // hack to force ProGuard to consider MemInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MemInfo.class);
  }

  /**
   * Per container information. Key: container name.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ResourceUtilizationReport> getContainers() {
    return containers;
  }

  /**
   * Per container information. Key: container name.
   * @param containers containers or {@code null} for none
   */
  public ResourceUtilizationReport setContainers(java.util.Map<String, ResourceUtilizationReport> containers) {
    this.containers = containers;
    return this;
  }

  /**
   * CPU utilization samples.
   * @return value or {@code null} for none
   */
  public java.util.List<CPUTime> getCpuTime() {
    return cpuTime;
  }

  /**
   * CPU utilization samples.
   * @param cpuTime cpuTime or {@code null} for none
   */
  public ResourceUtilizationReport setCpuTime(java.util.List<CPUTime> cpuTime) {
    this.cpuTime = cpuTime;
    return this;
  }

  /**
   * Optional. GPU usage samples.
   * @return value or {@code null} for none
   */
  public java.util.List<GPUUsage> getGpuUsage() {
    return gpuUsage;
  }

  /**
   * Optional. GPU usage samples.
   * @param gpuUsage gpuUsage or {@code null} for none
   */
  public ResourceUtilizationReport setGpuUsage(java.util.List<GPUUsage> gpuUsage) {
    this.gpuUsage = gpuUsage;
    return this;
  }

  /**
   * Memory utilization samples.
   * @return value or {@code null} for none
   */
  public java.util.List<MemInfo> getMemoryInfo() {
    return memoryInfo;
  }

  /**
   * Memory utilization samples.
   * @param memoryInfo memoryInfo or {@code null} for none
   */
  public ResourceUtilizationReport setMemoryInfo(java.util.List<MemInfo> memoryInfo) {
    this.memoryInfo = memoryInfo;
    return this;
  }

  @Override
  public ResourceUtilizationReport set(String fieldName, Object value) {
    return (ResourceUtilizationReport) super.set(fieldName, value);
  }

  @Override
  public ResourceUtilizationReport clone() {
    return (ResourceUtilizationReport) super.clone();
  }

}
