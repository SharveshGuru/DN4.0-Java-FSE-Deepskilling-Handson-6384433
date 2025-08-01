import React from "react";
import "./App.css";
import { books } from "./books";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const show = "all";

  let bookdetSection = (show === "all" || show === "book") ? <BookDetails books={books} /> : null;
  let blogSection = (show === "all" || show === "blog") ? <BlogDetails /> : null;
  let courseSection = (show === "all" || show === "course") ? <CourseDetails /> : null;

  return (
    <div>
      <div style={{ display: 'flex', justifyContent: 'center', marginTop: "60px" }}>
        <div className="mystyle1">
          <h1>Course Details</h1>
          {courseSection}
        </div>
        <div className="vl"></div>
        <div className="st2">
          <h1>Book Details</h1>
          {bookdetSection}
        </div>
        <div className="vl"></div>
        <div className="st2">
          <h1>Blog Details</h1>
          {blogSection}
        </div>
      </div>
    </div>
  );
}

export default App;
