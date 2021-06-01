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

package co.elastic.clients.elasticsearch.ml.evaluate_data_frame;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeClassificationSummaryAccuracy
public final class DataframeClassificationSummaryAccuracy implements ToJsonp {
	private final List<DataframeEvaluationClass> classes;

	private final Number overallAccuracy;

	// ---------------------------------------------------------------------------------------------

	protected DataframeClassificationSummaryAccuracy(Builder builder) {

		this.classes = Objects.requireNonNull(builder.classes, "classes");
		this.overallAccuracy = Objects.requireNonNull(builder.overallAccuracy, "overall_accuracy");

	}

	/**
	 * API name: {@code classes}
	 */
	public List<DataframeEvaluationClass> classes() {
		return this.classes;
	}

	/**
	 * API name: {@code overall_accuracy}
	 */
	public Number overallAccuracy() {
		return this.overallAccuracy;
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

		generator.writeKey("classes");
		generator.writeStartArray();
		for (DataframeEvaluationClass item0 : this.classes) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("overall_accuracy");
		generator.write(this.overallAccuracy.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeClassificationSummaryAccuracy}.
	 */
	public static class Builder implements ObjectBuilder<DataframeClassificationSummaryAccuracy> {
		private List<DataframeEvaluationClass> classes;

		private Number overallAccuracy;

		/**
		 * API name: {@code classes}
		 */
		public Builder classes(List<DataframeEvaluationClass> value) {
			this.classes = value;
			return this;
		}

		/**
		 * API name: {@code classes}
		 */
		public Builder classes(DataframeEvaluationClass... value) {
			this.classes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #classes(List)}, creating the list if needed.
		 */
		public Builder addClasses(DataframeEvaluationClass value) {
			if (this.classes == null) {
				this.classes = new ArrayList<>();
			}
			this.classes.add(value);
			return this;
		}

		/**
		 * Set {@link #classes(List)} to a singleton list.
		 */
		public Builder classes(Function<DataframeEvaluationClass.Builder, ObjectBuilder<DataframeEvaluationClass>> fn) {
			return this.classes(fn.apply(new DataframeEvaluationClass.Builder()).build());
		}

		/**
		 * Add a value to {@link #classes(List)}, creating the list if needed.
		 */
		public Builder addClasses(
				Function<DataframeEvaluationClass.Builder, ObjectBuilder<DataframeEvaluationClass>> fn) {
			return this.addClasses(fn.apply(new DataframeEvaluationClass.Builder()).build());
		}

		/**
		 * API name: {@code overall_accuracy}
		 */
		public Builder overallAccuracy(Number value) {
			this.overallAccuracy = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeClassificationSummaryAccuracy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeClassificationSummaryAccuracy build() {

			return new DataframeClassificationSummaryAccuracy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for DataframeClassificationSummaryAccuracy
	 */
	public static final JsonpValueParser<DataframeClassificationSummaryAccuracy> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new,
					DataframeClassificationSummaryAccuracy::setupDataframeClassificationSummaryAccuracyParser);

	protected static void setupDataframeClassificationSummaryAccuracyParser(
			DelegatingJsonpValueParser<DataframeClassificationSummaryAccuracy.Builder> op) {

		op.add(Builder::classes, JsonpValueParser.arrayParser(DataframeEvaluationClass.JSONP_PARSER), "classes");
		op.add(Builder::overallAccuracy, JsonpValueParser.numberParser(), "overall_accuracy");

	}

}