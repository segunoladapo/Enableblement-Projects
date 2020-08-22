import {Component, OnInit} from '@angular/core';
import {PostService} from '../service/PostService';
import {Post} from '../model/Post';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {
  posts: Post[] = [];
  hasMorePost = false;
  nextPage = 0;

  constructor(private postService: PostService) {
  }

  ngOnInit(): void {
    this.fetchPost();
  }

  fetchPost() {
    this.postService.getPosts(this.nextPage).subscribe(response => {
      if (response != null) {
        this.posts.push(...response.contents);
        this.nextPage++;
        this.hasMorePost = !response.last;
      } else {
        this.posts = [];
      }
    }, () => {
    });
  }
}


