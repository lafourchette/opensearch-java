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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.explain_data_frame_analytics.Request
public final class ExplainDataFrameAnalyticsRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final DataframeAnalyticsSource source;

	@Nullable
	private final DataframeAnalyticsDestination dest;

	private final DataframeAnalysisContainer analysis;

	@Nullable
	private final String description;

	@Nullable
	private final JsonValue modelMemoryLimit;

	@Nullable
	private final Number maxNumThreads;

	@Nullable
	private final JsonValue analyzedFields;

	@Nullable
	private final Boolean allowLazyStart;

	// ---------------------------------------------------------------------------------------------

	protected ExplainDataFrameAnalyticsRequest(Builder builder) {

		this.id = builder.id;
		this.source = builder.source;
		this.dest = builder.dest;
		this.analysis = Objects.requireNonNull(builder.analysis, "analysis");
		this.description = builder.description;
		this.modelMemoryLimit = builder.modelMemoryLimit;
		this.maxNumThreads = builder.maxNumThreads;
		this.analyzedFields = builder.analyzedFields;
		this.allowLazyStart = builder.allowLazyStart;

	}

	/**
	 * Identifier for the data frame analytics job. This identifier can contain
	 * lowercase alphanumeric characters (a-z and 0-9), hyphens, and underscores. It
	 * must start and end with alphanumeric characters.
	 *
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * The configuration of how to source the analysis data. It requires an index.
	 * Optionally, query and _source may be specified.
	 *
	 * API name: {@code source}
	 */
	@Nullable
	public DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * The destination configuration, consisting of index and optionally
	 * results_field (ml by default).
	 *
	 * API name: {@code dest}
	 */
	@Nullable
	public DataframeAnalyticsDestination dest() {
		return this.dest;
	}

	/**
	 * The analysis configuration, which contains the information necessary to
	 * perform one of the following types of analysis: classification, outlier
	 * detection, or regression.
	 *
	 * API name: {@code analysis}
	 */
	public DataframeAnalysisContainer analysis() {
		return this.analysis;
	}

	/**
	 * A description of the job.
	 *
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * The approximate maximum amount of memory resources that are permitted for
	 * analytical processing. The default value for data frame analytics jobs is
	 * 1gb. If your elasticsearch.yml file contains an
	 * xpack.ml.max_model_memory_limit setting, an error occurs when you try to
	 * create data frame analytics jobs that have model_memory_limit values greater
	 * than that setting.
	 *
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public JsonValue modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * The maximum number of threads to be used by the analysis. The default value
	 * is 1. Using more threads may decrease the time necessary to complete the
	 * analysis at the cost of using more CPU. Note that the process may use
	 * additional threads for operational functionality other than the analysis
	 * itself.
	 *
	 * API name: {@code max_num_threads}
	 */
	@Nullable
	public Number maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * Specify includes and/or excludes patterns to select which fields will be
	 * included in the analysis. The patterns specified in excludes are applied
	 * last, therefore excludes takes precedence. In other words, if the same field
	 * is specified in both includes and excludes, then the field will not be
	 * included in the analysis.
	 *
	 * API name: {@code analyzed_fields}
	 */
	@Nullable
	public JsonValue analyzedFields() {
		return this.analyzedFields;
	}

	/**
	 * Specifies whether this job can start when there is insufficient machine
	 * learning node capacity for it to be immediately assigned to a node.
	 *
	 * API name: {@code allow_lazy_start}
	 */
	@Nullable
	public Boolean allowLazyStart() {
		return this.allowLazyStart;
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

		if (this.source != null) {

			generator.writeKey("source");
			this.source.toJsonp(generator, mapper);

		}
		if (this.dest != null) {

			generator.writeKey("dest");
			this.dest.toJsonp(generator, mapper);

		}

		generator.writeKey("analysis");
		this.analysis.toJsonp(generator, mapper);

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.modelMemoryLimit != null) {

			generator.writeKey("model_memory_limit");
			generator.write(this.modelMemoryLimit);

		}
		if (this.maxNumThreads != null) {

			generator.writeKey("max_num_threads");
			generator.write(this.maxNumThreads.doubleValue());

		}
		if (this.analyzedFields != null) {

			generator.writeKey("analyzed_fields");
			generator.write(this.analyzedFields);

		}
		if (this.allowLazyStart != null) {

			generator.writeKey("allow_lazy_start");
			generator.write(this.allowLazyStart);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainDataFrameAnalyticsRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExplainDataFrameAnalyticsRequest> {
		@Nullable
		private String id;

		@Nullable
		private DataframeAnalyticsSource source;

		@Nullable
		private DataframeAnalyticsDestination dest;

		private DataframeAnalysisContainer analysis;

		@Nullable
		private String description;

		@Nullable
		private JsonValue modelMemoryLimit;

		@Nullable
		private Number maxNumThreads;

		@Nullable
		private JsonValue analyzedFields;

		@Nullable
		private Boolean allowLazyStart;

		/**
		 * Identifier for the data frame analytics job. This identifier can contain
		 * lowercase alphanumeric characters (a-z and 0-9), hyphens, and underscores. It
		 * must start and end with alphanumeric characters.
		 *
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * The configuration of how to source the analysis data. It requires an index.
		 * Optionally, query and _source may be specified.
		 *
		 * API name: {@code source}
		 */
		public Builder source(@Nullable DataframeAnalyticsSource value) {
			this.source = value;
			return this;
		}

		/**
		 * The configuration of how to source the analysis data. It requires an index.
		 * Optionally, query and _source may be specified.
		 *
		 * API name: {@code source}
		 */
		public Builder source(Function<DataframeAnalyticsSource.Builder, ObjectBuilder<DataframeAnalyticsSource>> fn) {
			return this.source(fn.apply(new DataframeAnalyticsSource.Builder()).build());
		}

		/**
		 * The destination configuration, consisting of index and optionally
		 * results_field (ml by default).
		 *
		 * API name: {@code dest}
		 */
		public Builder dest(@Nullable DataframeAnalyticsDestination value) {
			this.dest = value;
			return this;
		}

		/**
		 * The destination configuration, consisting of index and optionally
		 * results_field (ml by default).
		 *
		 * API name: {@code dest}
		 */
		public Builder dest(
				Function<DataframeAnalyticsDestination.Builder, ObjectBuilder<DataframeAnalyticsDestination>> fn) {
			return this.dest(fn.apply(new DataframeAnalyticsDestination.Builder()).build());
		}

		/**
		 * The analysis configuration, which contains the information necessary to
		 * perform one of the following types of analysis: classification, outlier
		 * detection, or regression.
		 *
		 * API name: {@code analysis}
		 */
		public Builder analysis(DataframeAnalysisContainer value) {
			this.analysis = value;
			return this;
		}

		/**
		 * The analysis configuration, which contains the information necessary to
		 * perform one of the following types of analysis: classification, outlier
		 * detection, or regression.
		 *
		 * API name: {@code analysis}
		 */
		public Builder analysis(
				Function<DataframeAnalysisContainer.Builder, ObjectBuilder<DataframeAnalysisContainer>> fn) {
			return this.analysis(fn.apply(new DataframeAnalysisContainer.Builder()).build());
		}

		/**
		 * A description of the job.
		 *
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The approximate maximum amount of memory resources that are permitted for
		 * analytical processing. The default value for data frame analytics jobs is
		 * 1gb. If your elasticsearch.yml file contains an
		 * xpack.ml.max_model_memory_limit setting, an error occurs when you try to
		 * create data frame analytics jobs that have model_memory_limit values greater
		 * than that setting.
		 *
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(@Nullable JsonValue value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * The maximum number of threads to be used by the analysis. The default value
		 * is 1. Using more threads may decrease the time necessary to complete the
		 * analysis at the cost of using more CPU. Note that the process may use
		 * additional threads for operational functionality other than the analysis
		 * itself.
		 *
		 * API name: {@code max_num_threads}
		 */
		public Builder maxNumThreads(@Nullable Number value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * Specify includes and/or excludes patterns to select which fields will be
		 * included in the analysis. The patterns specified in excludes are applied
		 * last, therefore excludes takes precedence. In other words, if the same field
		 * is specified in both includes and excludes, then the field will not be
		 * included in the analysis.
		 *
		 * API name: {@code analyzed_fields}
		 */
		public Builder analyzedFields(@Nullable JsonValue value) {
			this.analyzedFields = value;
			return this;
		}

		/**
		 * Specifies whether this job can start when there is insufficient machine
		 * learning node capacity for it to be immediately assigned to a node.
		 *
		 * API name: {@code allow_lazy_start}
		 */
		public Builder allowLazyStart(@Nullable Boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * Builds a {@link ExplainDataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainDataFrameAnalyticsRequest build() {

			return new ExplainDataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ExplainDataFrameAnalyticsRequest
	 */
	public static final JsonpValueParser<ExplainDataFrameAnalyticsRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new,
					ExplainDataFrameAnalyticsRequest::setupExplainDataFrameAnalyticsRequestParser);

	protected static void setupExplainDataFrameAnalyticsRequestParser(
			DelegatingJsonpValueParser<ExplainDataFrameAnalyticsRequest.Builder> op) {

		op.add(Builder::source, DataframeAnalyticsSource.JSONP_PARSER, "source");
		op.add(Builder::dest, DataframeAnalyticsDestination.JSONP_PARSER, "dest");
		op.add(Builder::analysis, DataframeAnalysisContainer.JSONP_PARSER, "analysis");
		op.add(Builder::description, JsonpValueParser.stringParser(), "description");
		op.add(Builder::modelMemoryLimit, JsonpValueParser.jsonValueParser(), "model_memory_limit");
		op.add(Builder::maxNumThreads, JsonpValueParser.numberParser(), "max_num_threads");
		op.add(Builder::analyzedFields, JsonpValueParser.jsonValueParser(), "analyzed_fields");
		op.add(Builder::allowLazyStart, JsonpValueParser.booleanParser(), "allow_lazy_start");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.explain_data_frame_analytics}".
	 */
	public static final Endpoint<ExplainDataFrameAnalyticsRequest, ExplainDataFrameAnalyticsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/_explain");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/");
					buf.append(request.id);
					buf.append("/_explain");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, ExplainDataFrameAnalyticsResponse.JSONP_PARSER);
}
