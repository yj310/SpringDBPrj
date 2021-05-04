# SpringDBPrj



database 구조

```sql
CREATE TABLE portfolio
(
    title       VARCHAR(50)     NOT NULL,	-- 프로젝트명
    memberCnt   NUMBER(20)      NOT NULL,	-- 개발인원
    langage     VARCHAR(50)     NOT NULL,	-- 개발언어
    IDE         VARCHAR(50)     NOT NULL,	-- 개발환경
    state       VARCHAR(20)     NOT NULL,	-- 개발상태
    devYear     NUMBER(4)       NOT NULL,	-- 개발년도
    period      VARCHAR(10),				-- 개발기간
    attach      VARCHAR(256)				-- 첨부파일
);
```



class 구조

```java
class Portfolio {
    String	title;		// 프로젝트명
    int		memberCnt;	// 개발인원
    String	language;	// 개발언어
    String	IDE;		// 개발환경
    String	state;		// 개발상태
    int		devYear;	// 개발년도
    String	period;		// 개발기간
    String	attach;		// 첨부파일
}

```

