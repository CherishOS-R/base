/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.server.integrity.parser;

import android.content.integrity.Rule;

import java.io.InputStream;
import java.util.List;

/** A helper class to parse rules into the {@link Rule} model from Binary representation. */
public class RuleBinaryParser implements RuleParser {

    @Override
    public List<Rule> parse(byte[] ruleBytes)  throws RuleParseException {
        // TODO: Implement binary text parser.
        return null;
    }

    @Override
    public List<Rule> parse(InputStream inputStream) throws RuleParseException {
        // TODO: Implement stream parser.
        return null;
    }
}
