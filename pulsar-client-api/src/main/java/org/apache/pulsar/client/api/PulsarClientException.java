/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pulsar.client.api;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Base type of exception thrown by Pulsar client.
 */
@SuppressWarnings("serial")
public class PulsarClientException extends IOException {

    /**
     * Constructs an {@code PulsarClientException} with the specified detail message.
     *
     * @param msg
     *        The detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method)
     */
    public PulsarClientException(String msg) {
        super(msg);
    }

    /**
     * Constructs an {@code PulsarClientException} with the specified cause.
     *
     * @param t
     *        The cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A null value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     */
    public PulsarClientException(Throwable t) {
        super(t);
    }

    /**
     * Invalid Service URL exception thrown by Pulsar client.
     */
    public static class InvalidServiceURL extends PulsarClientException {
        /**
         * Constructs an {@code InvalidServiceURL} with the specified cause.
         *
         * @param t
         *        The cause (which is saved for later retrieval by the
         *        {@link #getCause()} method).  (A null value is permitted,
         *        and indicates that the cause is nonexistent or unknown.)
         */
        public InvalidServiceURL(Throwable t) {
            super(t);
        }
    }

    /**
     * Invalid Configuration exception thrown by Pulsar client.
     */
    public static class InvalidConfigurationException extends PulsarClientException {
        /**
         * Constructs an {@code InvalidConfigurationException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public InvalidConfigurationException(String msg) {
            super(msg);
        }

        /**
         * Constructs an {@code InvalidConfigurationException} with the specified cause.
         *
         * @param t
         *        The cause (which is saved for later retrieval by the
         *        {@link #getCause()} method).  (A null value is permitted,
         *        and indicates that the cause is nonexistent or unknown.)
         */
        public InvalidConfigurationException(Throwable t) {
            super(t);
        }
    }

    /**
     * Not Found exception thrown by Pulsar client.
     */
    public static class NotFoundException extends PulsarClientException {
        /**
         * Constructs an {@code NotFoundException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public NotFoundException(String msg) {
            super(msg);
        }

        /**
         * Constructs an {@code NotFoundException} with the specified cause.
         *
         * @param t
         *        The cause (which is saved for later retrieval by the
         *        {@link #getCause()} method).  (A null value is permitted,
         *        and indicates that the cause is nonexistent or unknown.)
         */
        public NotFoundException(Throwable t) {
            super(t);
        }
    }

    /**
     * Timeout exception thrown by Pulsar client.
     */
    public static class TimeoutException extends PulsarClientException {
        /**
         * Constructs an {@code TimeoutException} with the specified cause.
         *
         * @param t
         *        The cause (which is saved for later retrieval by the
         *        {@link #getCause()} method).  (A null value is permitted,
         *        and indicates that the cause is nonexistent or unknown.)
         */
        public TimeoutException(Throwable t) {
            super(t);
        }

        /**
         * Constructs an {@code TimeoutException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public TimeoutException(String msg) {
            super(msg);
        }
    }

    /**
     * Incompatible schema exception thrown by Pulsar client.
     */
    public static class IncompatibleSchemaException extends PulsarClientException {
        /**
         * Constructs an {@code IncompatibleSchemaException} with the specified cause.
         *
         * @param t
         *        The cause (which is saved for later retrieval by the
         *        {@link #getCause()} method).  (A null value is permitted,
         *        and indicates that the cause is nonexistent or unknown.)
         */
        public IncompatibleSchemaException(Throwable t) {
            super(t);
        }

        /**
         * Constructs an {@code IncompatibleSchemaException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public IncompatibleSchemaException(String msg) {
            super(msg);
        }
    }

    /**
     * Lookup exception thrown by Pulsar client.
     */
    public static class LookupException extends PulsarClientException {
        /**
         * Constructs an {@code LookupException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public LookupException(String msg) {
            super(msg);
        }
    }

    /**
     * Too many requests exception thrown by Pulsar client.
     */
    public static class TooManyRequestsException extends LookupException {
        /**
         * Constructs an {@code TooManyRequestsException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public TooManyRequestsException(String msg) {
            super(msg);
        }
    }

    /**
     * Connect exception thrown by Pulsar client.
     */
    public static class ConnectException extends PulsarClientException {
        /**
         * Constructs an {@code ConnectException} with the specified cause.
         *
         * @param t
         *        The cause (which is saved for later retrieval by the
         *        {@link #getCause()} method).  (A null value is permitted,
         *        and indicates that the cause is nonexistent or unknown.)
         */
        public ConnectException(Throwable t) {
            super(t);
        }

        /**
         * Constructs an {@code ConnectException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public ConnectException(String msg) {
            super(msg);
        }
    }

    /**
     * Already closed exception thrown by Pulsar client.
     */
    public static class AlreadyClosedException extends PulsarClientException {
        /**
         * Constructs an {@code AlreadyClosedException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public AlreadyClosedException(String msg) {
            super(msg);
        }
    }

    /**
     * Topic terminated exception thrown by Pulsar client.
     */
    public static class TopicTerminatedException extends PulsarClientException {
        /**
         * Constructs an {@code TopicTerminatedException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public TopicTerminatedException(String msg) {
            super(msg);
        }
    }

    /**
     * Authentication exception thrown by Pulsar client.
     */
    public static class AuthenticationException extends PulsarClientException {
        /**
         * Constructs an {@code AuthenticationException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public AuthenticationException(String msg) {
            super(msg);
        }
    }

    /**
     * Authorization exception thrown by Pulsar client.
     */
    public static class AuthorizationException extends PulsarClientException {
        /**
         * Constructs an {@code AuthorizationException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public AuthorizationException(String msg) {
            super(msg);
        }
    }

    /**
     * Getting authentication data exception thrown by Pulsar client.
     */
    public static class GettingAuthenticationDataException extends PulsarClientException {
        /**
         * Constructs an {@code GettingAuthenticationDataException} with the specified cause.
         *
         * @param t
         *        The cause (which is saved for later retrieval by the
         *        {@link #getCause()} method).  (A null value is permitted,
         *        and indicates that the cause is nonexistent or unknown.)
         */
        public GettingAuthenticationDataException(Throwable t) {
            super(t);
        }

        /**
         * Constructs an {@code GettingAuthenticationDataException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public GettingAuthenticationDataException(String msg) {
            super(msg);
        }
    }

    /**
     * Unsupported authentication exception thrown by Pulsar client.
     */
    public static class UnsupportedAuthenticationException extends PulsarClientException {
        /**
         * Constructs an {@code UnsupportedAuthenticationException} with the specified cause.
         *
         * @param t
         *        The cause (which is saved for later retrieval by the
         *        {@link #getCause()} method).  (A null value is permitted,
         *        and indicates that the cause is nonexistent or unknown.)
         */
        public UnsupportedAuthenticationException(Throwable t) {
            super(t);
        }

        /**
         * Constructs an {@code UnsupportedAuthenticationException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public UnsupportedAuthenticationException(String msg) {
            super(msg);
        }
    }

    /**
     * Broker persistence exception thrown by Pulsar client.
     */
    public static class BrokerPersistenceException extends PulsarClientException {
        /**
         * Constructs an {@code BrokerPersistenceException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public BrokerPersistenceException(String msg) {
            super(msg);
        }
    }

    /**
     * Broker metadata exception thrown by Pulsar client.
     */
    public static class BrokerMetadataException extends PulsarClientException {
        /**
         * Constructs an {@code BrokerMetadataException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public BrokerMetadataException(String msg) {
            super(msg);
        }
    }

    /**
     * Producer busy exception thrown by Pulsar client.
     */
    public static class ProducerBusyException extends PulsarClientException {
        /**
         * Constructs an {@code ProducerBusyException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public ProducerBusyException(String msg) {
            super(msg);
        }
    }

    /**
     * Consumer busy exception thrown by Pulsar client.
     */
    public static class ConsumerBusyException extends PulsarClientException {
        /**
         * Constructs an {@code ConsumerBusyException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public ConsumerBusyException(String msg) {
            super(msg);
        }
    }

    /**
     * Not connected exception thrown by Pulsar client.
     */
    public static class NotConnectedException extends PulsarClientException {

        public NotConnectedException() {
            super("Not connected to broker");
        }
    }

    /**
     * Invalid message exception thrown by Pulsar client.
     */
    public static class InvalidMessageException extends PulsarClientException {
        /**
         * Constructs an {@code InvalidMessageException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public InvalidMessageException(String msg) {
            super(msg);
        }
    }

    /**
     * Invalid topic name exception thrown by Pulsar client.
     */
    public static class InvalidTopicNameException extends PulsarClientException {
        /**
         * Constructs an {@code InvalidTopicNameException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public InvalidTopicNameException(String msg) {
            super(msg);
        }
    }

    /**
     * Not supported exception thrown by Pulsar client.
     */
    public static class NotSupportedException extends PulsarClientException {
        /**
         * Constructs an {@code NotSupportedException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public NotSupportedException(String msg) {
            super(msg);
        }
    }

    /**
     * Full producer queue error thrown by Pulsar client.
     */
    public static class ProducerQueueIsFullError extends PulsarClientException {
        /**
         * Constructs an {@code ProducerQueueIsFullError} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public ProducerQueueIsFullError(String msg) {
            super(msg);
        }
    }

    /**
     * Producer blocked quota exceeded error thrown by Pulsar client.
     */
    public static class ProducerBlockedQuotaExceededError extends PulsarClientException {
        /**
         * Constructs an {@code ProducerBlockedQuotaExceededError} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public ProducerBlockedQuotaExceededError(String msg) {
            super(msg);
        }
    }

    /**
     * Producer blocked quota exceeded exception thrown by Pulsar client.
     */
    public static class ProducerBlockedQuotaExceededException extends PulsarClientException {
        /**
         * Constructs an {@code ProducerBlockedQuotaExceededException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public ProducerBlockedQuotaExceededException(String msg) {
            super(msg);
        }
    }

    /**
     * Checksum exception thrown by Pulsar client.
     */
    public static class ChecksumException extends PulsarClientException {
        /**
         * Constructs an {@code ChecksumException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public ChecksumException(String msg) {
            super(msg);
        }
    }

    /**
     * Crypto exception thrown by Pulsar client.
     */
    public static class CryptoException extends PulsarClientException {
        /**
         * Constructs an {@code CryptoException} with the specified detail message.
         *
         * @param msg
         *        The detail message (which is saved for later retrieval
         *        by the {@link #getMessage()} method)
         */
        public CryptoException(String msg) {
            super(msg);
        }
    }

    public static PulsarClientException unwrap(Throwable t) {
        if (t instanceof PulsarClientException) {
            return (PulsarClientException) t;
        } else if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        }  else if (t instanceof InterruptedException) {
            Thread.currentThread().interrupt();
            return new PulsarClientException(t);
        } else if (!(t instanceof ExecutionException)) {
            // Generic exception
            return new PulsarClientException(t);
        }

        // Unwrap the exception to keep the same exception type but a stack trace that includes the application calling
        // site
        Throwable cause = t.getCause();
        String msg = cause.getMessage();
        if (cause instanceof TimeoutException) {
            return new TimeoutException(msg);
        } else if (cause instanceof InvalidConfigurationException) {
            return new InvalidConfigurationException(msg);
        } else if (cause instanceof AuthenticationException) {
            return new AuthenticationException(msg);
        } else if (cause instanceof IncompatibleSchemaException) {
            return new IncompatibleSchemaException(msg);
        } else if (cause instanceof TooManyRequestsException) {
            return new TooManyRequestsException(msg);
        } else if (cause instanceof LookupException) {
            return new LookupException(msg);
        } else if (cause instanceof ConnectException) {
            return new ConnectException(msg);
        } else if (cause instanceof AlreadyClosedException) {
            return new AlreadyClosedException(msg);
        } else if (cause instanceof TopicTerminatedException) {
            return new TopicTerminatedException(msg);
        } else if (cause instanceof AuthorizationException) {
            return new AuthorizationException(msg);
        } else if (cause instanceof GettingAuthenticationDataException) {
            return new GettingAuthenticationDataException(msg);
        } else if (cause instanceof UnsupportedAuthenticationException) {
            return new UnsupportedAuthenticationException(msg);
        } else if (cause instanceof BrokerPersistenceException) {
            return new BrokerPersistenceException(msg);
        } else if (cause instanceof BrokerMetadataException) {
            return new BrokerMetadataException(msg);
        } else if (cause instanceof ProducerBusyException) {
            return new ProducerBusyException(msg);
        } else if (cause instanceof ConsumerBusyException) {
            return new ConsumerBusyException(msg);
        } else if (cause instanceof NotConnectedException) {
            return new NotConnectedException();
        } else if (cause instanceof InvalidMessageException) {
            return new InvalidMessageException(msg);
        } else if (cause instanceof InvalidTopicNameException) {
            return new InvalidTopicNameException(msg);
        } else if (cause instanceof NotSupportedException) {
            return new NotSupportedException(msg);
        } else if (cause instanceof ProducerQueueIsFullError) {
            return new ProducerQueueIsFullError(msg);
        } else if (cause instanceof ProducerBlockedQuotaExceededError) {
            return new ProducerBlockedQuotaExceededError(msg);
        } else if (cause instanceof ProducerBlockedQuotaExceededException) {
            return new ProducerBlockedQuotaExceededException(msg);
        } else if (cause instanceof ChecksumException) {
            return new ChecksumException(msg);
        } else if (cause instanceof CryptoException) {
            return new CryptoException(msg);
        } else {
            return new PulsarClientException(t);
        }
    }
}