/*
 * Copyright 2019 Vogle Labs.
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

package com.vogle.sbpayment.client.convert;

/**
 * Invalid request object exception
 *
 * @author Allan Im
 */
public class InvalidRequestException extends RuntimeException {

    private static final long serialVersionUID = -7541819458092770124L;

    /**
     * Constructs a new InvalidRequestException with the specified cause and a detail
     * message of <tt>(cause==null ? null : cause.toString())</tt> (which typically
     * contains the class and detail message of <tt>cause</tt>).  This constructor is
     * useful for runtime exceptions that are little more than wrappers for other
     * throwables.
     *
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()}
     *              method).  (A <tt>null</tt> value is permitted, and indicates that the
     *              cause is nonexistent or unknown.)
     */
    public InvalidRequestException(Throwable cause) {
        super(cause);
    }

}
