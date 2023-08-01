package com.cqupt.knowtolearn.service.chapter;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.knowtolearn.model.dto.req.ChapterReq;
import com.cqupt.knowtolearn.model.dto.req.MediaReq;
import com.cqupt.knowtolearn.model.po.chapter.CourseDetails;

import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * @author Ray
 * @date 2023/8/1 10:15
 * @description
 */
public interface ICourseDetailsService extends IService<CourseDetails> {

    void addCourseChapter(ChapterReq req);

    List<Map<String,Object>> getChapter(Integer courseId);

    URL addChapterMedia(MediaReq req);

    List<Map<String,Object>> getMedia(Integer chapterId);
}