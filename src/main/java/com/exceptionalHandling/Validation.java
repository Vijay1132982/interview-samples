package com.exceptionalHandling;

public class Validation {
    public class FileValidationException extends RuntimeException {
        public FileValidationException(String message) {
            super(message);
        }
    }

    public class AuthenticationException extends RuntimeException {
        public AuthenticationException(String message) {
            super(message);
        }
    }

    public class AccessForbiddenException extends RuntimeException {
        public AccessForbiddenException(String message) {
            super(message);
        }
    }

    public class InternalServerErrorException extends RuntimeException {
        public InternalServerErrorException(String message) {
            super(message);
        }
    }

    public class MethodNotAllowedException extends RuntimeException {
        public MethodNotAllowedException(String message) {
            super(message);
        }
    }

    public class CertificateIssueException extends RuntimeException {
        public CertificateIssueException(String message) {
            super(message);
        }
    }

}
