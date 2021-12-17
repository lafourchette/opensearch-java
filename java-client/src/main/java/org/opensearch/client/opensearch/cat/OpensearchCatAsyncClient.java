/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */
//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.cat;

import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.OpensearchException;
import org.opensearch.client.transport.Transport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ObjectBuilder;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the cat namespace.
 */
public class OpensearchCatAsyncClient extends ApiClient<OpensearchCatAsyncClient> {

	public OpensearchCatAsyncClient(Transport transport) {
		super(transport, null);
	}

	public OpensearchCatAsyncClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public OpensearchCatAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new OpensearchCatAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cat.aliases

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * 
	 */

	public CompletableFuture<AliasesResponse> aliases(AliasesRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, AliasesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AliasesRequest}
	 * 
	 */

	public final CompletableFuture<AliasesResponse> aliases(
			Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn)
			throws IOException, OpensearchException {
		return aliases(fn.apply(new AliasesRequest.Builder()).build());
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * 
	 */

	public CompletableFuture<AliasesResponse> aliases() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new AliasesRequest.Builder().build(), AliasesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.allocation

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * 
	 */

	public CompletableFuture<AllocationResponse> allocation(AllocationRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, AllocationRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AllocationRequest}
	 * 
	 */

	public final CompletableFuture<AllocationResponse> allocation(
			Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn)
			throws IOException, OpensearchException {
		return allocation(fn.apply(new AllocationRequest.Builder()).build());
	}

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * 
	 */

	public CompletableFuture<AllocationResponse> allocation() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new AllocationRequest.Builder().build(), AllocationRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.count

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * 
	 */

	public CompletableFuture<CountResponse> count(CountRequest request) throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, CountRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CountRequest}
	 * 
	 */

	public final CompletableFuture<CountResponse> count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException, OpensearchException {
		return count(fn.apply(new CountRequest.Builder()).build());
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * 
	 */

	public CompletableFuture<CountResponse> count() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new CountRequest.Builder().build(), CountRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.fielddata

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * 
	 */

	public CompletableFuture<FielddataResponse> fielddata(FielddataRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, FielddataRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FielddataRequest}
	 * 
	 */

	public final CompletableFuture<FielddataResponse> fielddata(
			Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn)
			throws IOException, OpensearchException {
		return fielddata(fn.apply(new FielddataRequest.Builder()).build());
	}

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * 
	 */

	public CompletableFuture<FielddataResponse> fielddata() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new FielddataRequest.Builder().build(), FielddataRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.health

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * 
	 */

	public CompletableFuture<HealthResponse> health(HealthRequest request) throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, HealthRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthRequest}
	 * 
	 */

	public final CompletableFuture<HealthResponse> health(
			Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn)
			throws IOException, OpensearchException {
		return health(fn.apply(new HealthRequest.Builder()).build());
	}

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * 
	 */

	public CompletableFuture<HealthResponse> health() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new HealthRequest.Builder().build(), HealthRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.help

	/**
	 * Returns help for the Cat APIs.
	 * 
	 * 
	 */
	public CompletableFuture<HelpResponse> help() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(HelpRequest._INSTANCE, HelpRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.indices

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * 
	 */

	public CompletableFuture<IndicesResponse> indices(IndicesRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, IndicesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndicesRequest}
	 * 
	 */

	public final CompletableFuture<IndicesResponse> indices(
			Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn)
			throws IOException, OpensearchException {
		return indices(fn.apply(new IndicesRequest.Builder()).build());
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * 
	 */

	public CompletableFuture<IndicesResponse> indices() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new IndicesRequest.Builder().build(), IndicesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.master

	/**
	 * Returns information about the master node.
	 * 
	 */
	public CompletableFuture<MasterResponse> master() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(MasterRequest._INSTANCE, MasterRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.nodeattrs

	/**
	 * Returns information about custom node attributes.
	 * 
	 * 
	 */
	public CompletableFuture<NodeattrsResponse> nodeattrs() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(NodeattrsRequest._INSTANCE, NodeattrsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.nodes

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * 
	 */

	public CompletableFuture<NodesResponse> nodes(NodesRequest request) throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, NodesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesRequest}
	 * 
	 */

	public final CompletableFuture<NodesResponse> nodes(Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn)
			throws IOException, OpensearchException {
		return nodes(fn.apply(new NodesRequest.Builder()).build());
	}

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * 
	 */

	public CompletableFuture<NodesResponse> nodes() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new NodesRequest.Builder().build(), NodesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.pending_tasks

	/**
	 * Returns a concise representation of the cluster pending tasks.
	 * 
	 * 
	 */
	public CompletableFuture<PendingTasksResponse> pendingTasks() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(PendingTasksRequest._INSTANCE, PendingTasksRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.plugins

	/**
	 * Returns information about installed plugins across nodes node.
	 * 
	 * 
	 */
	public CompletableFuture<PluginsResponse> plugins() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(PluginsRequest._INSTANCE, PluginsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.recovery

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 */

	public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, RecoveryRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RecoveryRequest}
	 */

	public final CompletableFuture<RecoveryResponse> recovery(
			Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
			throws IOException, OpensearchException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 */

	public CompletableFuture<RecoveryResponse> recovery() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new RecoveryRequest.Builder().build(), RecoveryRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.repositories

	/**
	 * Returns information about snapshot repositories registered in the cluster.
	 * 
	 */
	public CompletableFuture<RepositoriesResponse> repositories() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(RepositoriesRequest._INSTANCE, RepositoriesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.segments

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 */

	public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, SegmentsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SegmentsRequest}
	 */

	public final CompletableFuture<SegmentsResponse> segments(
			Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
			throws IOException, OpensearchException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 */

	public CompletableFuture<SegmentsResponse> segments() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new SegmentsRequest.Builder().build(), SegmentsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.shards

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 */

	public CompletableFuture<ShardsResponse> shards(ShardsRequest request) throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, ShardsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShardsRequest}
	 */

	public final CompletableFuture<ShardsResponse> shards(
			Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn)
			throws IOException, OpensearchException {
		return shards(fn.apply(new ShardsRequest.Builder()).build());
	}

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 */

	public CompletableFuture<ShardsResponse> shards() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new ShardsRequest.Builder().build(), ShardsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.snapshots

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 */

	public CompletableFuture<SnapshotsResponse> snapshots(SnapshotsRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, SnapshotsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SnapshotsRequest}
	 */

	public final CompletableFuture<SnapshotsResponse> snapshots(
			Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn)
			throws IOException, OpensearchException {
		return snapshots(fn.apply(new SnapshotsRequest.Builder()).build());
	}

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 */

	public CompletableFuture<SnapshotsResponse> snapshots() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new SnapshotsRequest.Builder().build(), SnapshotsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.tasks

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 */

	public CompletableFuture<TasksResponse> tasks(TasksRequest request) throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, TasksRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TasksRequest}
	 */

	public final CompletableFuture<TasksResponse> tasks(Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn)
			throws IOException, OpensearchException {
		return tasks(fn.apply(new TasksRequest.Builder()).build());
	}

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 */

	public CompletableFuture<TasksResponse> tasks() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new TasksRequest.Builder().build(), TasksRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.templates

	/**
	 * Returns information about existing templates.
	 * 
	 */

	public CompletableFuture<TemplatesResponse> templates(TemplatesRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, TemplatesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about existing templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TemplatesRequest}
	 */

	public final CompletableFuture<TemplatesResponse> templates(
			Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn)
			throws IOException, OpensearchException {
		return templates(fn.apply(new TemplatesRequest.Builder()).build());
	}

	/**
	 * Returns information about existing templates.
	 */

	public CompletableFuture<TemplatesResponse> templates() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new TemplatesRequest.Builder().build(), TemplatesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.thread_pool

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 */

	public CompletableFuture<ThreadPoolResponse> threadPool(ThreadPoolRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, ThreadPoolRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ThreadPoolRequest}
	 */

	public final CompletableFuture<ThreadPoolResponse> threadPool(
			Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn)
			throws IOException, OpensearchException {
		return threadPool(fn.apply(new ThreadPoolRequest.Builder()).build());
	}

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 */

	public CompletableFuture<ThreadPoolResponse> threadPool() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new ThreadPoolRequest.Builder().build(), ThreadPoolRequest.ENDPOINT,
				this.transportOptions);
	}

}