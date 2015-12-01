Model (
	Stakeholder("student") has (
		Prio(1),
		Req (" liveStream ") has Benefit(4),
		Req (" commentsSection ") has Benefit(6),
		Req (" lectureRating ") has Benefit(6),
		Req (" liveStreamQuestion ") has Benefit(4),
		Req (" playVideo ") has Benefit(18),
		Req (" courseRating ") has Benefit(6),
		Req (" lectureSlides ") has Benefit(14),
		Req (" stilLogin ") has Benefit(10),
		Req (" lucatLogin ") has Benefit(0),
		Req (" liveStreamChat ") has Benefit(2),
		Req (" courseInfo ") has Benefit(8),
		Req (" coursePage ") has Benefit(10),
		Req (" courseRatingDisplay ") has Benefit(6),
		Req (" lectureRatingDisplay ") has Benefit(6),
		Req (" adminLogin ") has Benefit(0)
		),
	Stakeholder (" lecturer ") has (
		Prio(2),
		Req (" liveStream ") has Benefit(2),
		Req (" commentsSection ") has Benefit(3),
		Req (" lectureRating ") has Benefit(15),
		Req (" liveStreamQuestion ") has Benefit(0),
		Req (" playVideo ") has Benefit(10),
		Req (" courseRating ") has Benefit(15),
		Req (" lectureSlides ") has Benefit(5),
		Req (" stilLogin ") has Benefit(10),
		Req (" lucatLogin ") has Benefit(15),
		Req (" liveStreamChat ") has Benefit(2),
		Req (" courseInfo ") has Benefit(2),
		Req (" coursePage ") has Benefit(10),
		Req (" courseRatingDisplay ") has Benefit(3),
		Req (" lectureRatingDisplay ") has Benefit(3),
		Req (" adminLogin ") has Benefit(5)
		)
	 )