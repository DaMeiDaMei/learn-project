package com.chinalife.jpa.dao;

import com.chinalife.jpa.entity.PtmAgriInfoEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tianyu
 * @version 1.0.0
 * @Date 2023-10-16 13:53:00
 */
@Repository
public interface PtmAgriInfoRepository extends JpaRepository<PtmAgriInfoEO, Long> {


    PtmAgriInfoEO findByBusinessNo(String businessNo);
}
