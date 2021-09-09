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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.search_template.Request
public final class SearchTemplateRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean profile;

	@Nullable
	private final String routing;

	@Nullable
	private final JsonValue scroll;

	@Nullable
	private final JsonValue searchType;

	@Nullable
	private final Boolean totalHitsAsInteger;

	@Nullable
	private final Boolean typedKeys;

	@Nullable
	private final String id;

	@Nullable
	private final Map<String, JsonValue> params;

	@Nullable
	private final String source;

	// ---------------------------------------------------------------------------------------------

	protected SearchTemplateRequest(Builder builder) {

		this.index = builder.index;
		this.allowNoIndices = builder.allowNoIndices;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.expandWildcards = builder.expandWildcards;
		this.explain = builder.explain;
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.preference = builder.preference;
		this.profile = builder.profile;
		this.routing = builder.routing;
		this.scroll = builder.scroll;
		this.searchType = builder.searchType;
		this.totalHitsAsInteger = builder.totalHitsAsInteger;
		this.typedKeys = builder.typedKeys;
		this.id = builder.id;
		this.params = builder.params;
		this.source = builder.source;

	}

	/**
	 * A comma-separated list of index names to search; use <code>_all</code> or
	 * empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Indicates whether network round-trips should be minimized as part of
	 * cross-cluster search requests execution
	 * <p>
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * server_default false
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public Boolean explain() {
		return this.explain;
	}

	/**
	 * Whether specified concrete, expanded or aliased indices should be ignored
	 * when throttled
	 * <p>
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random)
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * Specify whether to profile the query execution
	 * <p>
	 * API name: {@code profile}
	 */
	@Nullable
	public Boolean profile() {
		return this.profile;
	}

	/**
	 * A comma-separated list of specific routing values
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * Specify how long a consistent view of the index should be maintained for
	 * scrolled search
	 * <p>
	 * API name: {@code scroll}
	 */
	@Nullable
	public JsonValue scroll() {
		return this.scroll;
	}

	/**
	 * Search operation type
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public JsonValue searchType() {
		return this.searchType;
	}

	/**
	 * If true, hits.total are rendered as an integer in the response.
	 * <p>
	 * API name: {@code total_hits_as_integer}
	 */
	@Nullable
	public Boolean totalHitsAsInteger() {
		return this.totalHitsAsInteger;
	}

	/**
	 * Specify whether aggregation and suggester names should be prefixed by their
	 * respective types in the response
	 * <p>
	 * API name: {@code typed_keys}
	 */
	@Nullable
	public Boolean typedKeys() {
		return this.typedKeys;
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code params}
	 */
	@Nullable
	public Map<String, JsonValue> params() {
		return this.params;
	}

	/**
	 * API name: {@code source}
	 */
	@Nullable
	public String source() {
		return this.source;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.params != null) {

			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.source != null) {

			generator.writeKey("source");
			generator.write(this.source);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<SearchTemplateRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private Boolean explain;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private String preference;

		@Nullable
		private Boolean profile;

		@Nullable
		private String routing;

		@Nullable
		private JsonValue scroll;

		@Nullable
		private JsonValue searchType;

		@Nullable
		private Boolean totalHitsAsInteger;

		@Nullable
		private Boolean typedKeys;

		@Nullable
		private String id;

		@Nullable
		private Map<String, JsonValue> params;

		@Nullable
		private String source;

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Indicates whether network round-trips should be minimized as part of
		 * cross-cluster search requests execution
		 * <p>
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * server_default false
		 * <p>
		 * API name: {@code explain}
		 */
		public Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * Whether specified concrete, expanded or aliased indices should be ignored
		 * when throttled
		 * <p>
		 * API name: {@code ignore_throttled}
		 */
		public Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random)
		 * <p>
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Specify whether to profile the query execution
		 * <p>
		 * API name: {@code profile}
		 */
		public Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
		}

		/**
		 * A comma-separated list of specific routing values
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Specify how long a consistent view of the index should be maintained for
		 * scrolled search
		 * <p>
		 * API name: {@code scroll}
		 */
		public Builder scroll(@Nullable JsonValue value) {
			this.scroll = value;
			return this;
		}

		/**
		 * Search operation type
		 * <p>
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable JsonValue value) {
			this.searchType = value;
			return this;
		}

		/**
		 * If true, hits.total are rendered as an integer in the response.
		 * <p>
		 * API name: {@code total_hits_as_integer}
		 */
		public Builder totalHitsAsInteger(@Nullable Boolean value) {
			this.totalHitsAsInteger = value;
			return this;
		}

		/**
		 * Specify whether aggregation and suggester names should be prefixed by their
		 * respective types in the response
		 * <p>
		 * API name: {@code typed_keys}
		 */
		public Builder typedKeys(@Nullable Boolean value) {
			this.typedKeys = value;
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 */
		public Builder params(@Nullable Map<String, JsonValue> value) {
			this.params = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #params(Map)}, creating the map if needed.
		 */
		public Builder putParams(String key, JsonValue value) {
			if (this.params == null) {
				this.params = new HashMap<>();
			}
			this.params.put(key, value);
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(@Nullable String value) {
			this.source = value;
			return this;
		}

		/**
		 * Builds a {@link SearchTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchTemplateRequest build() {

			return new SearchTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SearchTemplateRequest
	 */
	public static final JsonpDeserializer<SearchTemplateRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SearchTemplateRequest::setupSearchTemplateRequestDeserializer);

	protected static void setupSearchTemplateRequestDeserializer(
			DelegatingDeserializer<SearchTemplateRequest.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"params");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search_template}".
	 */
	private static final Endpoint.Simple<SearchTemplateRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_search");
					buf.append("/template");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_search");
					buf.append("/template");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.explain != null) {
					params.put("explain", String.valueOf(request.explain));
				}
				if (request.ignoreThrottled != null) {
					params.put("ignore_throttled", String.valueOf(request.ignoreThrottled));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.profile != null) {
					params.put("profile", String.valueOf(request.profile));
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.scroll != null) {
					params.put("scroll", request.scroll.toString());
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.toString());
				}
				if (request.totalHitsAsInteger != null) {
					params.put("total_hits_as_integer", String.valueOf(request.totalHitsAsInteger));
				}
				if (request.typedKeys != null) {
					params.put("typed_keys", String.valueOf(request.typedKeys));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code search_template}" endpoint.
	 */
	public static <TDocument> Endpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ElasticsearchError> createSearchTemplateEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT.withResponseDeserializer(
				SearchTemplateResponse.createSearchTemplateResponseDeserializer(tDocumentDeserializer));
	}
}