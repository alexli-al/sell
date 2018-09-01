package com.mtx.sell.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mtx.sell.config.LocalDateTimeConvert;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    @Convert(converter = LocalDateTimeConvert.class)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Convert(converter = LocalDateTimeConvert.class)
    private LocalDateTime lastModifiedDate ;

    public BaseEntity(){}

    public BaseEntity(Long id, LocalDateTime createdDate, LocalDateTime lastModifiedDate) {
        this.id = id;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @DateTimeFormat(pattern="yyyy-MM-ddHH:mm:ss")
    public LocalDateTime getCreatedDate() {
        return  createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @DateTimeFormat(pattern="yyyy-MM-ddHH:mm:ss")
    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
