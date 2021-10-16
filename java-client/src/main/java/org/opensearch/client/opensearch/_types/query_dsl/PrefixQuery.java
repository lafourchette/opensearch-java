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

package org.opensearch.client.opensearch._types.query_dsl;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.PrefixQuery
@JsonpDeserializable
public class PrefixQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	@Nullable
	private final String rewrite;

	private final String value;

	@Nullable
	private final Boolean caseInsensitive;

	// ---------------------------------------------------------------------------------------------

	private PrefixQuery(Builder builder) {
		super(builder);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");

		this.rewrite = builder.rewrite;
		this.value = ModelTypeHelper.requireNonNull(builder.value, this, "value");
		this.caseInsensitive = builder.caseInsensitive;

	}

	public static PrefixQuery of(Function<Builder, ObjectBuilder<PrefixQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "prefix";
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code rewrite}
	 */
	@Nullable
	public final String rewrite() {
		return this.rewrite;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final String value() {
		return this.value;
	}

	/**
	 * API name: {@code case_insensitive}
	 */
	@Nullable
	public final Boolean caseInsensitive() {
		return this.caseInsensitive;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		if (this.rewrite != null) {
			generator.writeKey("rewrite");
			generator.write(this.rewrite);

		}
		generator.writeKey("value");
		generator.write(this.value);

		if (this.caseInsensitive != null) {
			generator.writeKey("case_insensitive");
			generator.write(this.caseInsensitive);

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PrefixQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<PrefixQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Nullable
		private String rewrite;

		private String value;

		@Nullable
		private Boolean caseInsensitive;

		/**
		 * API name: {@code rewrite}
		 */
		public final Builder rewrite(@Nullable String value) {
			this.rewrite = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = value;
			return this;
		}

		/**
		 * API name: {@code case_insensitive}
		 */
		public final Builder caseInsensitive(@Nullable Boolean value) {
			this.caseInsensitive = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PrefixQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PrefixQuery build() {
			_checkSingleUse();

			return new PrefixQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PrefixQuery}
	 */
	public static final JsonpDeserializer<PrefixQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PrefixQuery::setupPrefixQueryDeserializer, Builder::build);

	protected static void setupPrefixQueryDeserializer(DelegatingDeserializer<PrefixQuery.Builder> op) {
		setupQueryBaseDeserializer(op);
		op.add(Builder::rewrite, JsonpDeserializer.stringDeserializer(), "rewrite");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");
		op.add(Builder::caseInsensitive, JsonpDeserializer.booleanDeserializer(), "case_insensitive");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
		op.shortcutProperty("value");

	}

}