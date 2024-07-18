package org.example._02springweb_;

import lombok.Data;

public record Message (
    String name,
    String message,
    String id
    ) {

}
