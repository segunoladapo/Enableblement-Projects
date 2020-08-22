import {Component, Input, OnInit} from '@angular/core';
import {Post} from '../model/Post';
import {Router} from '@angular/router';
import {StorageService} from '../service/storage.service';

@Component({
  selector: 'app-post-view',
  templateUrl: './post-view.component.html',
  styleUrls: ['./post-view.component.css']
})
export class PostViewComponent implements OnInit {
  @Input()
  post: Post;

  constructor(private router: Router, private storageService: StorageService) {
  }

  ngOnInit(): void {
  }


  viewComments() {
    console.log('View Comments is clicked');
    this.storageService.setItem('currentPost', JSON.stringify(this.post));
    this.router.navigate(['/comment']);
  }

}
