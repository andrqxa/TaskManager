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

import com.andrqxa.training.taskmanager.enums.Status;
import static com.andrqxa.training.taskmanager.enums.Status.*;
import java.time.LocalDateTime;
import java.util.UUID;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The class which stores on element of task queue
 *
 * @author Andrey Pugachenko <andrqxa@gmail.com>
 */
public class TaskQueue {

    private final UUID id;
    private final LocalDateTime timeStart;
    private LocalDateTime timeFinish;
    private Status status;
    private Person person;
    private Task task;

    public TaskQueue() {
        this.id = UUID.randomUUID();
        this.timeStart = LocalDateTime.now();
        this.status = INIT;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public LocalDateTime getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(LocalDateTime timeFinish) {
        this.timeFinish = timeFinish;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public int hashCode() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(this.id)
                .append(this.timeStart)
                .append(this.timeFinish)
                .append(this.status)
                .append(this.person)
                .append(this.task);

        return builder.toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskQueue)) {
            return false;
        }

        TaskQueue other = (TaskQueue) obj;

        EqualsBuilder builder = new EqualsBuilder();
        builder.append(this.id, other.getId())
                .append(this.timeStart, other.getTimeStart())
                .append(this.timeFinish, other.getTimeFinish())
                .append(this.status, other.getStatus())
                .append(this.person, other.getPerson())
                .append(this.task, other.getTask());

        return builder.isEquals();
    }

}
