/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.generator.builders.extensions.resources;

import com.squareup.javapoet.MethodSpec;
import org.raml.jaxrs.generator.CurrentBuild;
import org.raml.jaxrs.generator.builders.extensions.ContextImpl;
import org.raml.jaxrs.generator.extension.resources.api.ResourceContext;
import org.raml.jaxrs.generator.ramltypes.GMethod;
import org.raml.jaxrs.generator.ramltypes.GRequest;
import org.raml.ramltopojo.RamlToPojo;

/**
 * Created by Jean-Philippe Belanger on 1/29/17. Just potential zeroes and ones
 */
public class ResourceContextImpl extends ContextImpl implements ResourceContext {

  public ResourceContextImpl(CurrentBuild build) {
    super(build);
  }

  @Override
  public MethodSpec.Builder onMethod(ResourceContext context, GMethod method, GRequest gRequest, MethodSpec.Builder methodSpec) {

    return getBuildContext().withResourceListeners().onMethod(context, method, gRequest, methodSpec);
  }

  @Override
  public RamlToPojo fetchRamlToPojoBuilder() {
    return getBuild().fetchRamlToPojoBuilder();
  }
}
