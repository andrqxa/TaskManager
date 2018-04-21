/*
 * Copyright 2018 Andrey Pugachenko <andrqxa@gmail.com>.
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
package com.andrqxa.training.taskmanager.manager;

import java.util.Optional;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

/**
 * The class which stores task
 *
 * @author Andrey Pugachenko <andrqxa@gmail.com>
 */
public class Task {

    private final UUID id;
    private String name;
    private String description;

    public Task() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        Optional<String> result = Optional.ofNullable(name);
        return result.orElse(StringUtils.EMPTY);
    }

    public void setName(String name) {
        Optional<String> result = Optional.ofNullable(name);
        this.name = result.orElse(StringUtils.EMPTY);
    }

    public String getDescription() {
        Optional<String> result = Optional.ofNullable(description);
        return result.orElse(StringUtils.EMPTY);
    }

    public void setDescription(String description) {
        Optional<String> result = Optional.ofNullable(name);
        this.description = result.orElse(StringUtils.EMPTY);
    }

}
