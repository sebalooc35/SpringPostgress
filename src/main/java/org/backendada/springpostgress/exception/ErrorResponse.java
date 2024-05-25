package org.backendada.springpostgress.exception;

public class ErrorResponse {
    private String error;
    private String reason;
    private int status;
    private String path;
    private String timestamp;

    public ErrorResponse() {}

    public ErrorResponse(String error, String reason, int status, String path, String timestamp) {
        this.error = error;
        this.reason = reason;
        this.status = status;
        this.path = path;
        this.timestamp = timestamp;
    }

    public String getError() { return error; }
    public void setError(String error) { this.error = error; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}
