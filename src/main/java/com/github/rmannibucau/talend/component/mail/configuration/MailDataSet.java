/**
 * Copyright (C) 2019 rmannibucau
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.rmannibucau.talend.component.mail.configuration;

import java.io.Serializable;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.type.DataSet;
import org.talend.sdk.component.api.configuration.ui.OptionsOrder;
import org.talend.sdk.component.api.meta.Documentation;

import lombok.Data;

@Data
@DataSet("MailDataSet")
@Documentation("The dataset to connect to a particular mailbox. It is only the connection currently.")
@OptionsOrder("connection")
public class MailDataSet implements Serializable {

    private static final long serialVersionUID = 1;

    @Option
    @Documentation("The mail connection.")
    private MailConnection connection = new MailConnection();
}
