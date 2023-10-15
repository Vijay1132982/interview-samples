package com.exceptionalHandling;

@RestController
public class MyController {

    @GetMapping("/validateFile")
    public ResponseEntity<String> validateFile() {
        if (/* file validation fails */) {
            throw new FileValidationException("File validation failed");
        }
        // ... continue processing
    }

    @GetMapping("/secureData")
    public ResponseEntity<String> secureData() {
        if (/* authentication fails */) {
            throw new AuthenticationException("Authentication failed");
        }
        // ... continue processing
    }

    @GetMapping("/forbiddenResource")
    public ResponseEntity<String> forbiddenResource() {
        if (/* access is forbidden */) {
            throw new AccessForbiddenException("Access to this resource is forbidden");
        }
        // ... continue processing
    }

    @GetMapping("/serverError")
    public ResponseEntity<String> serverError() {
        if (/* an internal server error occurs */) {
            throw new InternalServerErrorException("An internal server error occurred");
        }
        // ... continue processing
    }

    @GetMapping("/methodNotAllowed")
    public ResponseEntity<String> methodNotAllowed() {
        if (/* request method is not allowed */) {
            throw new MethodNotAllowedException("Method not allowed for this resource");
        }
        // ... continue processing
    }

    @GetMapping("/certificateIssue")
    public ResponseEntity<String> certificateIssue() {
        if (/* certificate issue is detected */) {
            throw new CertificateIssueException("Certificate issue detected");
        }
        // ... continue processing
    }

    // Other controller methods handling different scenarios
}
