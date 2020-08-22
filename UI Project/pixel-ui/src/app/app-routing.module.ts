import {RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {PostComponent} from './post/post.component';
import {CommentComponent} from './comment/comment.component';

const routes: Routes = [
  {
    component: CommentComponent,
    path: 'comment'
  },
  {
    component: PostComponent,
    path: 'post'
  },
  {
    path: '*',
    redirectTo: 'post'
  },
  {
    path: '**',
    redirectTo: 'post'
  },


];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
