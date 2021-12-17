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

package org.opensearch.client.opensearch.indices;

import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.OpensearchException;
import org.opensearch.client.transport.BooleanResponse;
import org.opensearch.client.transport.Transport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ObjectBuilder;

import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the indices namespace.
 */
public class OpensearchIndicesClient extends ApiClient<OpensearchIndicesClient> {

	public OpensearchIndicesClient(Transport transport) {
		super(transport, null);
	}

	public OpensearchIndicesClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public OpensearchIndicesClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new OpensearchIndicesClient(this.transport, transportOptions);
	}

	// ----- Endpoint: indices.add_block

	/**
	 * Adds a block to an index.
	 * 
	 * 
	 */

	public AddBlockResponse addBlock(AddBlockRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, AddBlockRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Adds a block to an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AddBlockRequest}
	 * 
	 */

	public final AddBlockResponse addBlock(Function<AddBlockRequest.Builder, ObjectBuilder<AddBlockRequest>> fn)
			throws IOException, OpensearchException {
		return addBlock(fn.apply(new AddBlockRequest.Builder()).build());
	}

	// ----- Endpoint: indices.analyze

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * 
	 */

	public AnalyzeResponse analyze(AnalyzeRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, AnalyzeRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AnalyzeRequest}
	 * 
	 */

	public final AnalyzeResponse analyze(Function<AnalyzeRequest.Builder, ObjectBuilder<AnalyzeRequest>> fn)
			throws IOException, OpensearchException {
		return analyze(fn.apply(new AnalyzeRequest.Builder()).build());
	}

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * 
	 */

	public AnalyzeResponse analyze() throws IOException, OpensearchException {
		return this.transport.performRequest(new AnalyzeRequest.Builder().build(), AnalyzeRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.clear_cache

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * 
	 */

	public ClearCacheResponse clearCache(ClearCacheRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, ClearCacheRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCacheRequest}
	 * 
	 */

	public final ClearCacheResponse clearCache(Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn)
			throws IOException, OpensearchException {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * 
	 */

	public ClearCacheResponse clearCache() throws IOException, OpensearchException {
		return this.transport.performRequest(new ClearCacheRequest.Builder().build(), ClearCacheRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.clone

	/**
	 * Clones an index
	 * 
	 * 
	 */

	public CloneIndexResponse clone(CloneIndexRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, CloneIndexRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Clones an index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloneIndexRequest}
	 * 
	 */

	public final CloneIndexResponse clone(Function<CloneIndexRequest.Builder, ObjectBuilder<CloneIndexRequest>> fn)
			throws IOException, OpensearchException {
		return clone(fn.apply(new CloneIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.close

	/**
	 * Closes an index.
	 * 
	 * 
	 */

	public CloseIndexResponse close(CloseIndexRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, CloseIndexRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Closes an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloseIndexRequest}
	 * 
	 */

	public final CloseIndexResponse close(Function<CloseIndexRequest.Builder, ObjectBuilder<CloseIndexRequest>> fn)
			throws IOException, OpensearchException {
		return close(fn.apply(new CloseIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create

	/**
	 * Creates an index with optional settings and mappings.
	 * 
	 * 
	 */

	public CreateIndexResponse create(CreateIndexRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, CreateIndexRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates an index with optional settings and mappings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateIndexRequest}
	 * 
	 */

	public final CreateIndexResponse create(Function<CreateIndexRequest.Builder, ObjectBuilder<CreateIndexRequest>> fn)
			throws IOException, OpensearchException {
		return create(fn.apply(new CreateIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete

	/**
	 * Deletes an index.
	 * 
	 * 
	 */

	public DeleteIndexResponse delete(DeleteIndexRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, DeleteIndexRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Deletes an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteIndexRequest}
	 * 
	 */

	public final DeleteIndexResponse delete(Function<DeleteIndexRequest.Builder, ObjectBuilder<DeleteIndexRequest>> fn)
			throws IOException, OpensearchException {
		return delete(fn.apply(new DeleteIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_alias

	/**
	 * Deletes an alias.
	 * 
	 * 
	 */

	public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, DeleteAliasRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Deletes an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAliasRequest}
	 * 
	 */

	public final DeleteAliasResponse deleteAlias(
			Function<DeleteAliasRequest.Builder, ObjectBuilder<DeleteAliasRequest>> fn)
			throws IOException, OpensearchException {
		return deleteAlias(fn.apply(new DeleteAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_index_template

	/**
	 * Deletes an index template.
	 * 
	 * 
	 */

	public DeleteIndexTemplateResponse deleteIndexTemplate(DeleteIndexTemplateRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, DeleteIndexTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Deletes an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteIndexTemplateRequest}
	 * 
	 */

	public final DeleteIndexTemplateResponse deleteIndexTemplate(
			Function<DeleteIndexTemplateRequest.Builder, ObjectBuilder<DeleteIndexTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return deleteIndexTemplate(fn.apply(new DeleteIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_template

	/**
	 * Deletes an index template.
	 * 
	 * 
	 */

	public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, DeleteTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Deletes an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteTemplateRequest}
	 * 
	 */

	public final DeleteTemplateResponse deleteTemplate(
			Function<DeleteTemplateRequest.Builder, ObjectBuilder<DeleteTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return deleteTemplate(fn.apply(new DeleteTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.disk_usage

	/**
	 * Analyzes the disk usage of each field of an index or data stream
	 * 
	 * 
	 */

	public DiskUsageResponse diskUsage(DiskUsageRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, DiskUsageRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Analyzes the disk usage of each field of an index or data stream
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DiskUsageRequest}
	 * 
	 */

	public final DiskUsageResponse diskUsage(Function<DiskUsageRequest.Builder, ObjectBuilder<DiskUsageRequest>> fn)
			throws IOException, OpensearchException {
		return diskUsage(fn.apply(new DiskUsageRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists

	/**
	 * Returns information about whether a particular index exists.
	 * 
	 * 
	 */

	public BooleanResponse exists(ExistsRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, ExistsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about whether a particular index exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsRequest}
	 * 
	 */

	public final BooleanResponse exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
			throws IOException, OpensearchException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_alias

	/**
	 * Returns information about whether a particular alias exists.
	 * 
	 * 
	 */

	public BooleanResponse existsAlias(ExistsAliasRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, ExistsAliasRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about whether a particular alias exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsAliasRequest}
	 * 
	 */

	public final BooleanResponse existsAlias(Function<ExistsAliasRequest.Builder, ObjectBuilder<ExistsAliasRequest>> fn)
			throws IOException, OpensearchException {
		return existsAlias(fn.apply(new ExistsAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_index_template

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * 
	 */

	public BooleanResponse existsIndexTemplate(ExistsIndexTemplateRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, ExistsIndexTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsIndexTemplateRequest}
	 * 
	 */

	public final BooleanResponse existsIndexTemplate(
			Function<ExistsIndexTemplateRequest.Builder, ObjectBuilder<ExistsIndexTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return existsIndexTemplate(fn.apply(new ExistsIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_template

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * 
	 */

	public BooleanResponse existsTemplate(ExistsTemplateRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, ExistsTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsTemplateRequest}
	 * 
	 */

	public final BooleanResponse existsTemplate(
			Function<ExistsTemplateRequest.Builder, ObjectBuilder<ExistsTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return existsTemplate(fn.apply(new ExistsTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_type

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 * 
	 * 
	 */

	public BooleanResponse existsType(ExistsTypeRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, ExistsTypeRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsTypeRequest}
	 * 
	 */

	public final BooleanResponse existsType(Function<ExistsTypeRequest.Builder, ObjectBuilder<ExistsTypeRequest>> fn)
			throws IOException, OpensearchException {
		return existsType(fn.apply(new ExistsTypeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.flush

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * 
	 */

	public FlushResponse flush(FlushRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, FlushRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FlushRequest}
	 * 
	 */

	public final FlushResponse flush(Function<FlushRequest.Builder, ObjectBuilder<FlushRequest>> fn)
			throws IOException, OpensearchException {
		return flush(fn.apply(new FlushRequest.Builder()).build());
	}

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * 
	 */

	public FlushResponse flush() throws IOException, OpensearchException {
		return this.transport.performRequest(new FlushRequest.Builder().build(), FlushRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.forcemerge

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * 
	 */

	public ForcemergeResponse forcemerge(ForcemergeRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, ForcemergeRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ForcemergeRequest}
	 * 
	 */

	public final ForcemergeResponse forcemerge(Function<ForcemergeRequest.Builder, ObjectBuilder<ForcemergeRequest>> fn)
			throws IOException, OpensearchException {
		return forcemerge(fn.apply(new ForcemergeRequest.Builder()).build());
	}

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * 
	 */

	public ForcemergeResponse forcemerge() throws IOException, OpensearchException {
		return this.transport.performRequest(new ForcemergeRequest.Builder().build(), ForcemergeRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get

	/**
	 * Returns information about one or more indices.
	 * 
	 * 
	 */

	public GetIndexResponse get(GetIndexRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, GetIndexRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndexRequest}
	 * 
	 */

	public final GetIndexResponse get(Function<GetIndexRequest.Builder, ObjectBuilder<GetIndexRequest>> fn)
			throws IOException, OpensearchException {
		return get(fn.apply(new GetIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_alias

	/**
	 * Returns an alias.
	 * 
	 * 
	 */

	public GetAliasResponse getAlias(GetAliasRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, GetAliasRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAliasRequest}
	 * 
	 */

	public final GetAliasResponse getAlias(Function<GetAliasRequest.Builder, ObjectBuilder<GetAliasRequest>> fn)
			throws IOException, OpensearchException {
		return getAlias(fn.apply(new GetAliasRequest.Builder()).build());
	}

	/**
	 * Returns an alias.
	 * 
	 * 
	 */

	public GetAliasResponse getAlias() throws IOException, OpensearchException {
		return this.transport.performRequest(new GetAliasRequest.Builder().build(), GetAliasRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_field_mapping

	/**
	 * Returns mapping for one or more fields.
	 * 
	 * 
	 */

	public GetFieldMappingResponse getFieldMapping(GetFieldMappingRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, GetFieldMappingRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns mapping for one or more fields.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetFieldMappingRequest}
	 * 
	 */

	public final GetFieldMappingResponse getFieldMapping(
			Function<GetFieldMappingRequest.Builder, ObjectBuilder<GetFieldMappingRequest>> fn)
			throws IOException, OpensearchException {
		return getFieldMapping(fn.apply(new GetFieldMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_index_template

	/**
	 * Returns an index template.
	 * 
	 * 
	 */

	public GetIndexTemplateResponse getIndexTemplate(GetIndexTemplateRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, GetIndexTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndexTemplateRequest}
	 * 
	 */

	public final GetIndexTemplateResponse getIndexTemplate(
			Function<GetIndexTemplateRequest.Builder, ObjectBuilder<GetIndexTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return getIndexTemplate(fn.apply(new GetIndexTemplateRequest.Builder()).build());
	}

	/**
	 * Returns an index template.
	 * 
	 * 
	 */

	public GetIndexTemplateResponse getIndexTemplate() throws IOException, OpensearchException {
		return this.transport.performRequest(new GetIndexTemplateRequest.Builder().build(),
				GetIndexTemplateRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.get_mapping

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * 
	 */

	public GetMappingResponse getMapping(GetMappingRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, GetMappingRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetMappingRequest}
	 * 
	 */

	public final GetMappingResponse getMapping(Function<GetMappingRequest.Builder, ObjectBuilder<GetMappingRequest>> fn)
			throws IOException, OpensearchException {
		return getMapping(fn.apply(new GetMappingRequest.Builder()).build());
	}

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * 
	 */

	public GetMappingResponse getMapping() throws IOException, OpensearchException {
		return this.transport.performRequest(new GetMappingRequest.Builder().build(), GetMappingRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_settings

	/**
	 * Returns settings for one or more indices.
	 * 
	 * 
	 */

	public GetSettingsResponse getSettings(GetSettingsRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, GetSettingsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSettingsRequest}
	 * 
	 */

	public final GetSettingsResponse getSettings(
			Function<GetSettingsRequest.Builder, ObjectBuilder<GetSettingsRequest>> fn)
			throws IOException, OpensearchException {
		return getSettings(fn.apply(new GetSettingsRequest.Builder()).build());
	}

	/**
	 * Returns settings for one or more indices.
	 * 
	 * 
	 */

	public GetSettingsResponse getSettings() throws IOException, OpensearchException {
		return this.transport.performRequest(new GetSettingsRequest.Builder().build(), GetSettingsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_template

	/**
	 * Returns an index template.
	 * 
	 * 
	 */

	public GetTemplateResponse getTemplate(GetTemplateRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, GetTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTemplateRequest}
	 * 
	 */

	public final GetTemplateResponse getTemplate(
			Function<GetTemplateRequest.Builder, ObjectBuilder<GetTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return getTemplate(fn.apply(new GetTemplateRequest.Builder()).build());
	}

	/**
	 * Returns an index template.
	 * 
	 * 
	 */

	public GetTemplateResponse getTemplate() throws IOException, OpensearchException {
		return this.transport.performRequest(new GetTemplateRequest.Builder().build(), GetTemplateRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.open

	/**
	 * Opens an index.
	 * 
	 * 
	 */

	public OpenResponse open(OpenRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, OpenRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Opens an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OpenRequest}
	 * 
	 */

	public final OpenResponse open(Function<OpenRequest.Builder, ObjectBuilder<OpenRequest>> fn)
			throws IOException, OpensearchException {
		return open(fn.apply(new OpenRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_alias

	/**
	 * Creates or updates an alias.
	 * 
	 * 
	 */

	public PutAliasResponse putAlias(PutAliasRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, PutAliasRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates or updates an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAliasRequest}
	 * 
	 */

	public final PutAliasResponse putAlias(Function<PutAliasRequest.Builder, ObjectBuilder<PutAliasRequest>> fn)
			throws IOException, OpensearchException {
		return putAlias(fn.apply(new PutAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_index_template

	/**
	 * Creates or updates an index template.
	 * 
	 * 
	 */

	public PutIndexTemplateResponse putIndexTemplate(PutIndexTemplateRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, PutIndexTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates or updates an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutIndexTemplateRequest}
	 * 
	 */

	public final PutIndexTemplateResponse putIndexTemplate(
			Function<PutIndexTemplateRequest.Builder, ObjectBuilder<PutIndexTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return putIndexTemplate(fn.apply(new PutIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_mapping

	/**
	 * Updates the index mappings.
	 * 
	 * 
	 */

	public PutMappingResponse putMapping(PutMappingRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, PutMappingRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Updates the index mappings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutMappingRequest}
	 * 
	 */

	public final PutMappingResponse putMapping(Function<PutMappingRequest.Builder, ObjectBuilder<PutMappingRequest>> fn)
			throws IOException, OpensearchException {
		return putMapping(fn.apply(new PutMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_settings

	/**
	 * Updates the index settings.
	 * 
	 * 
	 */

	public PutSettingsResponse putSettings(PutSettingsRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, PutSettingsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Updates the index settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutSettingsRequest}
	 * 
	 */

	public final PutSettingsResponse putSettings(
			Function<PutSettingsRequest.Builder, ObjectBuilder<PutSettingsRequest>> fn)
			throws IOException, OpensearchException {
		return putSettings(fn.apply(new PutSettingsRequest.Builder()).build());
	}

	/**
	 * Updates the index settings.
	 * 
	 * 
	 */

	public PutSettingsResponse putSettings() throws IOException, OpensearchException {
		return this.transport.performRequest(new PutSettingsRequest.Builder().build(), PutSettingsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.put_template

	/**
	 * Creates or updates an index template.
	 * 
	 * 
	 */

	public PutTemplateResponse putTemplate(PutTemplateRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, PutTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates or updates an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTemplateRequest}
	 * 
	 */

	public final PutTemplateResponse putTemplate(
			Function<PutTemplateRequest.Builder, ObjectBuilder<PutTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return putTemplate(fn.apply(new PutTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.recovery

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * 
	 */

	public RecoveryResponse recovery(RecoveryRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, RecoveryRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RecoveryRequest}
	 * 
	 */

	public final RecoveryResponse recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
			throws IOException, OpensearchException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * 
	 */

	public RecoveryResponse recovery() throws IOException, OpensearchException {
		return this.transport.performRequest(new RecoveryRequest.Builder().build(), RecoveryRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.refresh

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * 
	 */

	public RefreshResponse refresh(RefreshRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, RefreshRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RefreshRequest}
	 * 
	 */

	public final RefreshResponse refresh(Function<RefreshRequest.Builder, ObjectBuilder<RefreshRequest>> fn)
			throws IOException, OpensearchException {
		return refresh(fn.apply(new RefreshRequest.Builder()).build());
	}

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * 
	 */

	public RefreshResponse refresh() throws IOException, OpensearchException {
		return this.transport.performRequest(new RefreshRequest.Builder().build(), RefreshRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.resolve_index

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 * 
	 * 
	 */

	public ResolveIndexResponse resolveIndex(ResolveIndexRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, ResolveIndexRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResolveIndexRequest}
	 * 
	 */

	public final ResolveIndexResponse resolveIndex(
			Function<ResolveIndexRequest.Builder, ObjectBuilder<ResolveIndexRequest>> fn)
			throws IOException, OpensearchException {
		return resolveIndex(fn.apply(new ResolveIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.rollover

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 * 
	 * 
	 */

	public RolloverResponse rollover(RolloverRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, RolloverRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RolloverRequest}
	 * 
	 */

	public final RolloverResponse rollover(Function<RolloverRequest.Builder, ObjectBuilder<RolloverRequest>> fn)
			throws IOException, OpensearchException {
		return rollover(fn.apply(new RolloverRequest.Builder()).build());
	}

	// ----- Endpoint: indices.segments

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * 
	 */

	public SegmentsResponse segments(SegmentsRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, SegmentsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SegmentsRequest}
	 * 
	 */

	public final SegmentsResponse segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
			throws IOException, OpensearchException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * 
	 */

	public SegmentsResponse segments() throws IOException, OpensearchException {
		return this.transport.performRequest(new SegmentsRequest.Builder().build(), SegmentsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.shard_stores

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * 
	 */

	public ShardStoresResponse shardStores(ShardStoresRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, ShardStoresRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShardStoresRequest}
	 * 
	 */

	public final ShardStoresResponse shardStores(
			Function<ShardStoresRequest.Builder, ObjectBuilder<ShardStoresRequest>> fn)
			throws IOException, OpensearchException {
		return shardStores(fn.apply(new ShardStoresRequest.Builder()).build());
	}

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * 
	 */

	public ShardStoresResponse shardStores() throws IOException, OpensearchException {
		return this.transport.performRequest(new ShardStoresRequest.Builder().build(), ShardStoresRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.shrink

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 * 
	 * 
	 */

	public ShrinkResponse shrink(ShrinkRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, ShrinkRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShrinkRequest}
	 * 
	 */

	public final ShrinkResponse shrink(Function<ShrinkRequest.Builder, ObjectBuilder<ShrinkRequest>> fn)
			throws IOException, OpensearchException {
		return shrink(fn.apply(new ShrinkRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_index_template

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 * 
	 * 
	 */

	public SimulateIndexTemplateResponse simulateIndexTemplate(SimulateIndexTemplateRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, SimulateIndexTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateIndexTemplateRequest}
	 * 
	 */

	public final SimulateIndexTemplateResponse simulateIndexTemplate(
			Function<SimulateIndexTemplateRequest.Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return simulateIndexTemplate(fn.apply(new SimulateIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_template

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * 
	 */

	public SimulateTemplateResponse simulateTemplate(SimulateTemplateRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, SimulateTemplateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateTemplateRequest}
	 * 
	 */

	public final SimulateTemplateResponse simulateTemplate(
			Function<SimulateTemplateRequest.Builder, ObjectBuilder<SimulateTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return simulateTemplate(fn.apply(new SimulateTemplateRequest.Builder()).build());
	}

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * 
	 */

	public SimulateTemplateResponse simulateTemplate() throws IOException, OpensearchException {
		return this.transport.performRequest(new SimulateTemplateRequest.Builder().build(),
				SimulateTemplateRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.split

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 * 
	 * 
	 */

	public SplitResponse split(SplitRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, SplitRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SplitRequest}
	 * 
	 */

	public final SplitResponse split(Function<SplitRequest.Builder, ObjectBuilder<SplitRequest>> fn)
			throws IOException, OpensearchException {
		return split(fn.apply(new SplitRequest.Builder()).build());
	}

	// ----- Endpoint: indices.stats

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * 
	 */

	public IndicesStatsResponse stats(IndicesStatsRequest request) throws IOException, OpensearchException {
		return this.transport.performRequest(request, IndicesStatsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndicesStatsRequest}
	 * 
	 */

	public final IndicesStatsResponse stats(
			Function<IndicesStatsRequest.Builder, ObjectBuilder<IndicesStatsRequest>> fn)
			throws IOException, OpensearchException {
		return stats(fn.apply(new IndicesStatsRequest.Builder()).build());
	}

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * 
	 */

	public IndicesStatsResponse stats() throws IOException, OpensearchException {
		return this.transport.performRequest(new IndicesStatsRequest.Builder().build(), IndicesStatsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.update_aliases

	/**
	 * Updates index aliases.
	 * 
	 * 
	 */

	public UpdateAliasesResponse updateAliases(UpdateAliasesRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, UpdateAliasesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Updates index aliases.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateAliasesRequest}
	 * 
	 */

	public final UpdateAliasesResponse updateAliases(
			Function<UpdateAliasesRequest.Builder, ObjectBuilder<UpdateAliasesRequest>> fn)
			throws IOException, OpensearchException {
		return updateAliases(fn.apply(new UpdateAliasesRequest.Builder()).build());
	}

	/**
	 * Updates index aliases.
	 * 
	 * 
	 */

	public UpdateAliasesResponse updateAliases() throws IOException, OpensearchException {
		return this.transport.performRequest(new UpdateAliasesRequest.Builder().build(), UpdateAliasesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.validate_query

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * 
	 */

	public ValidateQueryResponse validateQuery(ValidateQueryRequest request)
			throws IOException, OpensearchException {
		return this.transport.performRequest(request, ValidateQueryRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ValidateQueryRequest}
	 * 
	 */

	public final ValidateQueryResponse validateQuery(
			Function<ValidateQueryRequest.Builder, ObjectBuilder<ValidateQueryRequest>> fn)
			throws IOException, OpensearchException {
		return validateQuery(fn.apply(new ValidateQueryRequest.Builder()).build());
	}

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * 
	 */

	public ValidateQueryResponse validateQuery() throws IOException, OpensearchException {
		return this.transport.performRequest(new ValidateQueryRequest.Builder().build(), ValidateQueryRequest.ENDPOINT,
				this.transportOptions);
	}

}