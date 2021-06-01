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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.shards.ShardsRecord;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.shards.Response
public final class ShardsResponse implements ToJsonp {
	private final List<ShardsRecord> value;

	// ---------------------------------------------------------------------------------------------

	protected ShardsResponse(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Response value.
	 *
	 * API name: {@code value}
	 */
	public List<ShardsRecord> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (ShardsRecord item0 : this.value) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsResponse}.
	 */
	public static class Builder implements ObjectBuilder<ShardsResponse> {
		private List<ShardsRecord> value;

		/**
		 * Response value.
		 *
		 * API name: {@code value}
		 */
		public Builder value(List<ShardsRecord> value) {
			this.value = value;
			return this;
		}

		/**
		 * Response value.
		 *
		 * API name: {@code value}
		 */
		public Builder value(ShardsRecord... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(ShardsRecord value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * Set {@link #value(List)} to a singleton list.
		 */
		public Builder value(Function<ShardsRecord.Builder, ObjectBuilder<ShardsRecord>> fn) {
			return this.value(fn.apply(new ShardsRecord.Builder()).build());
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(Function<ShardsRecord.Builder, ObjectBuilder<ShardsRecord>> fn) {
			return this.addValue(fn.apply(new ShardsRecord.Builder()).build());
		}

		/**
		 * Builds a {@link ShardsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsResponse build() {

			return new ShardsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ShardsResponse
	 */
	public static final JsonpValueParser<ShardsResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ShardsResponse::setupShardsResponseParser);

	protected static void setupShardsResponseParser(DelegatingJsonpValueParser<ShardsResponse.Builder> op) {

		op.add(Builder::value, JsonpValueParser.arrayParser(ShardsRecord.JSONP_PARSER), "value");

	}

}