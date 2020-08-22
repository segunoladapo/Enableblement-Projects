import {Component, OnInit} from '@angular/core';
import {Comment} from '../model/Comment';

import {StorageService} from '../service/storage.service';
import {CommentService} from '../service/CommentService';
import {Router} from '@angular/router';
import {Post} from '../model/Post';

@Component({
  selector: 'app-comment',
  templateUrl: './comment.component.html',
  styleUrls: ['./comment.component.css']
})
export class CommentComponent implements OnInit {
  post: Post = null;
  comments: Comment[] = [];
  hasMoreComments: boolean = false;
  nextPage: number = 0;

  constructor(private commentService: CommentService, private storageService: StorageService, private router: Router) {
  }

  ngOnInit(): void {
    this.post = JSON.parse(this.storageService.getItem('currentPost'));
    if (this.post === null) {
      this.router.navigate(['/post']);
    } else {
      this.post = this.post;
      this.storageService.removeItem('currentPost');
      this.fetchNextComments();
    }
  }

  fetchNextComments() {
    this.commentService.getComments(this.post.id, this.nextPage).subscribe(response => {
      if (response != null) {
        this.comments.push(...response.contents);
        this.nextPage++;
        this.hasMoreComments = !response.last;
      } else {
        this.comments = [];
      }
    }, () => {
    });
  }
}

