package kr.or.connect.reservation.service.impl;

import kr.or.connect.reservation.dao.DisplayInfoDao;
import kr.or.connect.reservation.dto.DisplayInfo;
import kr.or.connect.reservation.service.DisplayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DisplayInfoServiceImpl implements DisplayInfoService {
    @Autowired
    DisplayInfoDao displayInfoDao;

    @Override
    @Transactional
    public int getTotalCount() {
        return displayInfoDao.getTotalCount();
    }

    @Override
    @Transactional
    public int getCountByCategoryId(int categoryId){
        return displayInfoDao.getCountByCategoryId(categoryId);
    }

    @Override
    public DisplayInfo getDisplayInfoById(int displayId) {
        return displayInfoDao.getDisplayInfoById(displayId);
    }

    @Override
    @Transactional
    public List<DisplayInfo> getDisplayInfos(int start, int categoryId) { //
        int totalCount = getTotalCount();
        return displayInfoDao.getDisplayInfos(start, totalCount, categoryId);
    }
}
