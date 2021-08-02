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

package org.opensearch.clients.elasticsearch.cat;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.elasticsearch.cat.data_frame_analytics.DataFrameAnalyticsRecord;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

// typedef: cat.data_frame_analytics.Response
public final class DataFrameAnalyticsResponse implements ToJsonp {
	private final List<DataFrameAnalyticsRecord> value;

	// ---------------------------------------------------------------------------------------------

	protected DataFrameAnalyticsResponse(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Response value.
	 *
	 * API name: {@code value}
	 */
	public List<DataFrameAnalyticsRecord> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (DataFrameAnalyticsRecord item0 : this.value) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataFrameAnalyticsResponse}.
	 */
	public static class Builder implements ObjectBuilder<DataFrameAnalyticsResponse> {
		private List<DataFrameAnalyticsRecord> value;

		/**
		 * Response value.
		 *
		 * API name: {@code value}
		 */
		public Builder value(List<DataFrameAnalyticsRecord> value) {
			this.value = value;
			return this;
		}

		/**
		 * Response value.
		 *
		 * API name: {@code value}
		 */
		public Builder value(DataFrameAnalyticsRecord... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(DataFrameAnalyticsRecord value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * Set {@link #value(List)} to a singleton list.
		 */
		public Builder value(Function<DataFrameAnalyticsRecord.Builder, ObjectBuilder<DataFrameAnalyticsRecord>> fn) {
			return this.value(fn.apply(new DataFrameAnalyticsRecord.Builder()).build());
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(
				Function<DataFrameAnalyticsRecord.Builder, ObjectBuilder<DataFrameAnalyticsRecord>> fn) {
			return this.addValue(fn.apply(new DataFrameAnalyticsRecord.Builder()).build());
		}

		/**
		 * Builds a {@link DataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataFrameAnalyticsResponse build() {

			return new DataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataFrameAnalyticsResponse
	 */
	public static final JsonpDeserializer<DataFrameAnalyticsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DataFrameAnalyticsResponse::setupDataFrameAnalyticsResponseDeserializer);

	protected static void setupDataFrameAnalyticsResponseDeserializer(
			DelegatingDeserializer<DataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(DataFrameAnalyticsRecord.DESERIALIZER), "value");

	}

}